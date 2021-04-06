package io.github.atlascommunity.marklet.builders;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.SeeTag;
import com.sun.javadoc.Tag;

import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;

@RequiredArgsConstructor
public class MarkdownTag {
  private final Tag tag;

  private final String fileEnding;

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
