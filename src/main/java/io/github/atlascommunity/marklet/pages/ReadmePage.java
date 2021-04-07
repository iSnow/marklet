package io.github.atlascommunity.marklet.pages;

import static io.github.atlascommunity.marklet.constants.Filenames.PACKAGE_INDEX_FILE;
import static io.github.atlascommunity.marklet.constants.Filenames.README_FILE;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.List;

import com.sun.javadoc.PackageDoc;

import io.github.atlascommunity.marklet.Options;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

/** Index of project packages */
@RequiredArgsConstructor
public class ReadmePage implements DocumentPage {

  /** List of project packages */
  private final List<PackageDoc> packages;

  /** Doclet options */
  private final Options options;

  /** Table header */
  private static final String TABLE_PACKAGE_HEADER = "Package";

  /**
   * Build document and write it to the selected folder
   *
   * @throws IOException something went wrong during write operation
   */
  @Override
  public void build() throws IOException {

    StringBuilder tableOfContents =
        new StringBuilder().append(new Heading("Project packages list", 1)).append("\n");

    int numberOfEntries = packages.size() + 1;

    Table.Builder tableEntries =
        new Table.Builder()
            .withAlignments(Table.ALIGN_LEFT)
            .withRowLimit(numberOfEntries)
            .addRow(TABLE_PACKAGE_HEADER);

    packages.forEach(
        p -> {
          String linkName = p.name();
          String linkUrl = linkName.replace(".", "/") + "/" + PACKAGE_INDEX_FILE;
          tableEntries.addRow(new Link(linkName, linkUrl));
        });

    tableOfContents.append(tableEntries.build());
    FileOutputStream fileSystem =
        new FileOutputStream(Paths.get(options.getOutputDirectory(), README_FILE).toString());

    try (Writer readmeFile = new OutputStreamWriter(fileSystem, StandardCharsets.UTF_8)) {
      readmeFile.write(tableOfContents.toString());
    }
  }
}
