package io.github.atlascommunity.marklet.builders;

import static io.github.atlascommunity.marklet.constants.Filenames.README_FILE;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.sun.javadoc.PackageDoc;

import io.github.atlascommunity.marklet.MarkletOptions;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import net.steppschuh.markdowngenerator.table.Table;
import net.steppschuh.markdowngenerator.text.heading.Heading;

@RequiredArgsConstructor
public class ReadmePage {

  private final List<PackageDoc> packages;

  private final MarkletOptions options;

  public void build() throws IOException {

    StringBuilder readme =
        new StringBuilder().append(new Heading("Project packages list", 1)).append("\n");

    Table.Builder table =
        new Table.Builder()
            .withAlignments(Table.ALIGN_RIGHT, Table.ALIGN_LEFT)
            .withRowLimit(packages.size())
            .addRow("Package");

    packages.forEach(
        p -> {
          String linkName = p.name();
          String linkUrl = linkName.replace(".", "/");
          table.addRow(new Link(linkName, linkUrl));
        });
    readme.append(table.build());

    Path readmeFilePath = Paths.get(options.getOutputDirectory(), README_FILE);
    try (Writer fileToDisk =
        new OutputStreamWriter(
            new FileOutputStream(readmeFilePath.toString()), StandardCharsets.UTF_8)) {

      fileToDisk.write(readme.toString());
    }
  }
}
