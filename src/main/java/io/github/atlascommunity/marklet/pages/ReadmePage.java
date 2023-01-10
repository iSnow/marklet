package io.github.atlascommunity.marklet.pages;


import io.github.atlascommunity.marklet.Options;
import jdk.javadoc.doclet.Reporter;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;

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
      tableOfContents.append(new Heading("List of modules", 1)).append("\n");
      Table.Builder moduleTable =
              new Table.Builder()
                      .withAlignments(Table.ALIGN_LEFT)
                      .withRowLimit(modules.size() +1)
                      .addRow(TABLE_MODULE_HEADER);
      modules.forEach(
              p -> {
                moduleTable.addRow(p.getQualifiedName().toString());
              });
      tableOfContents.append(moduleTable.build()).append("\n\n");
    }
    tableOfContents.append(new Heading("List of packages", 1)).append("\n");

    int numberOfEntries = packages.size() + 1;

    Table.Builder tableEntries =
        new Table.Builder()
            .withAlignments(Table.ALIGN_LEFT)
            .withRowLimit(numberOfEntries)
            .addRow(TABLE_PACKAGE_HEADER);

    packages.forEach(
        p -> {
          String linkName = p.getQualifiedName().toString();
          String linkUrl = linkName.replace(".", "/") + "/" + PACKAGE_INDEX_FILE;
          tableEntries.addRow(new Link(linkName, linkUrl));
        });

    tableOfContents.append(tableEntries.build());
    return tableOfContents.toString();
  }

  @Override
  public void write() throws IOException {
    write(build(), README_FILE, null, options);
  }
}
