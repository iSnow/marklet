package io.github.atlascommunity.marklet.pages;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.Tag;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;

/** Javadoc tag processor */
@RequiredArgsConstructor
public class MarkdownTag {

  /** Tag information */
  private final Tag tag;

  /** File ending from doclet options */
  private final String fileEnding;

  /** Create markdown string from tag */
  public String create() {

    if (("@link").equals(tag.name())) {
      SeeTag seeTag = (SeeTag) tag;
      ClassDoc referencedClassDoc = seeTag.referencedClass();
      if (referencedClassDoc != null) {
        String linkName = referencedClassDoc.name();
        String linkUrl = linkName.replace(".", "/") + "/" + linkName + "." + fileEnding;

        return new Link(linkName, linkUrl).toString();
      }
    }

    return tag.text().replace("<p>", "").replace("</p>", "");
  }
}
