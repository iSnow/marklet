package io.github.atlascommunity.marklet.pages;


import io.github.atlascommunity.marklet.Options;
import jdk.javadoc.doclet.Reporter;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;
import org.apache.commons.lang3.StringUtils;

import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import java.io.IOException;
import java.util.*;

import static io.github.atlascommunity.marklet.constants.Filenames.PACKAGE_INDEX_FILE;
import static io.github.atlascommunity.marklet.constants.Filenames.README_FILE;
import static io.github.atlascommunity.marklet.constants.Labels.TABLE_MODULE_HEADER;
import static io.github.atlascommunity.marklet.constants.Labels.TABLE_PACKAGE_HEADER;

/** Index of project packages */
@RequiredArgsConstructor
public class ReadmePage extends DocumentPage {

  /** List of modules in the project */
  private final List<ModuleElement> modules;

  /** List of project packages */
  private final List<PackageElement> packages;

  /** Doclet options */
  private final Options options;

  private final Reporter reporter;

  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  @Override
  public String build() throws IOException {

    StringBuilder tableOfContents = new StringBuilder();

    if (modules.size() > 0) {
      tableOfContents.append(generateModuleInfo(modules));
    }
    if (packages.size() > 0) {
      tableOfContents.append(generatePackageInfo(packages, options));
    }
    return tableOfContents.toString();
  }

  private static String generateModuleInfo(List<ModuleElement> modules) {

    StringBuilder moduleSummary = new StringBuilder();
    moduleSummary.append(new Heading("List of modules", 1)).append("\n");
    Table.Builder moduleTable =
            new Table.Builder()
                    .withAlignments(Table.ALIGN_LEFT)
                    .withRowLimit(modules.size() +1)
                    .addRow(TABLE_MODULE_HEADER);
    modules.forEach(
            p -> {
              moduleTable.addRow(p.getQualifiedName().toString());
            });
    moduleSummary.append(moduleTable.build()).append("\n\n");
    return moduleSummary.toString();
  }

  private static String generatePackageInfo(List<PackageElement> packages, Options options) {

    StringBuilder packageSummary = new StringBuilder();
    packageSummary.append(new Heading("List of packages", 1)).append("\n");

    int numberOfEntries = packages.size() + 1;

    Table.Builder tableEntries =
            new Table.Builder()
                    .withAlignments(Table.ALIGN_LEFT)
                    .withRowLimit(numberOfEntries)
                    .addRow(TABLE_PACKAGE_HEADER);

    PackageElement root = null;
    PackageElement previous = null;
    for (PackageElement p : packages) {
      if (null == previous) {
        previous = p;
        continue;
      }
      final String common = StringUtils.getCommonPrefix(
              previous.getQualifiedName().toString(),
              p.getQualifiedName().toString());
      if (common.equals(p.getQualifiedName().toString())) {
        root = p;
      } else if (common.equals(previous.getQualifiedName().toString())) {
        root = previous;
      }
      previous = p;
    }

    Map<Integer, Set<PackageElement>> sortedPackages = new TreeMap<>();
    if (null != root) {
      for (PackageElement p : packages) {
        final String common = StringUtils.getCommonPrefix(
                root.getQualifiedName().toString(),
                p.getQualifiedName().toString());
        int len = p.getQualifiedName().toString().length() - common.length();
        Set<PackageElement> distN = sortedPackages.get(len);
        if (null == distN) {
          distN = new TreeSet<>(Comparator.comparing(o -> o.getSimpleName().toString()));
          sortedPackages.put(len, distN);
        }
        distN.add(p);
      }
    }

    sortedPackages.forEach(
        (k,v) -> {
          v.forEach((p)-> {
            String linkName = p.getQualifiedName().toString();
            String linkUrl = linkName.replace(".", "/")
                    + "/" + PACKAGE_INDEX_FILE + "." +options.getFileEnding();
            tableEntries.addRow(new Link(linkName, linkUrl));
          });
        });

    packageSummary.append(tableEntries.build());
    return packageSummary.toString();
  }

  @Override
  public void write() throws IOException {
    write(build(), README_FILE, null, options);
  }
}
