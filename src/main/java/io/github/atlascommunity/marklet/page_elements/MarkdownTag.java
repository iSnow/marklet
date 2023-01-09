package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.LinkTree;
import com.sun.source.doctree.ReferenceTree;
import com.sun.source.doctree.TextTree;
import io.github.atlascommunity.marklet.util.Sanitizers;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.link.Link;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;

import static com.sun.source.doctree.DocTree.Kind.*;

/** Javadoc tag processor */
@RequiredArgsConstructor
public class MarkdownTag {

  /** Tag information */
  private final DocTree tag;

  private final String className;

  /** File ending from doclet options */
  private final String fileEnding;

  /** Create markdown string from tag */
  public String create() {
    String content = "";
    if (tag.getKind().equals(LINK) || (tag.getKind().equals(LINK_PLAIN))) {
      LinkTree seeTag = (LinkTree) tag;
      ReferenceTree reference = seeTag.getReference();
      if (reference != null) {
        String linkName = reference.getSignature();
        String label = seeTag.getLabel().stream().map(Object::toString).collect(Collectors.joining(", "));
        label = ((!StringUtils.isEmpty(label)) ? label : linkName);
        String linkUrl;
        String[] parts = linkName.split("#");
        if (parts.length>1) {
          linkUrl = "#"+parts[1]
                  .replaceAll("\\(", "")
                  .replaceAll("\\)", "")
                  .replaceAll("[, <>]", "-")
                  .toLowerCase();
        } else {
          linkUrl = linkName.replace(".", "/") + "/" + label + "." + fileEnding;
        }
        content = new Link(linkName, linkUrl).toString();
      }
    } else if(tag.getKind().equals(TEXT)) {
        TextTree txt = (TextTree) tag;
        content = txt.getBody();
    } else {
      content = tag.toString();
    }
    /*if (("@link").equals(tag.name())) {
      SeeTag seeTag = (SeeTag) tag;
      ClassDoc referencedClassDoc = seeTag.referencedClass();
      if (referencedClassDoc != null) {
        String linkName = referencedClassDoc.name();
        String linkUrl = linkName.replace(".", "/") + "/" + linkName + "." + fileEnding;

        return new Link(linkName, linkUrl).toString();

    }}*/

    return Sanitizers.sanitizeHtmlTags(content);
  }
}
