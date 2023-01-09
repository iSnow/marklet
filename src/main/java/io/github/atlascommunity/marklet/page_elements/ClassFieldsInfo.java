package io.github.atlascommunity.marklet.page_elements;

import com.sun.source.doctree.DocCommentTree;
import com.sun.source.util.DocTrees;
import io.github.atlascommunity.marklet.util.MarkletTypeUtils;
import io.github.atlascommunity.marklet.util.Sanitizers;
import lombok.RequiredArgsConstructor;
import net.steppschuh.markdowngenerator.text.heading.Heading;

import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.atlascommunity.marklet.constants.Labels.FIELDS;

/** Class fields description */
@RequiredArgsConstructor
public class ClassFieldsInfo implements ClassPageElement {

  /** Class information */
  private final TypeElement classElement;
  private  final DocTrees treeUtils;

  /** @return markdown string representation of document part */
  @Override
  public String generate() {

    Set<VariableElement> fields = MarkletTypeUtils.findClassFields(classElement);
    int numberOfFields = fields.size();
    if (numberOfFields > 0) {
      Heading sectionHeading = new Heading(FIELDS, 1);
      StringBuilder fieldsInfo = new StringBuilder().append(sectionHeading).append("\n");
      fields.forEach(
                f -> {
                  TypeMirror typeMirror = f.asType();
                  String headingText = String.format("%s %s", typeMirror, f.getSimpleName());
                  StringBuilder rawFieldDescription =
                          new StringBuilder().append(new Heading(headingText, 2)).append("\n");

                    DocCommentTree comments = treeUtils.getDocCommentTree(f);
                    if (null == comments) {
                        rawFieldDescription.append("*No description provided*").append("\n").append("\n");
                    } else {
                        rawFieldDescription.append(comments.getFullBody().stream().map(Object::toString).collect(Collectors.joining())).append("\n").append("\n");
                    }
                    String fieldDescription = Sanitizers.sanitizePackageNames(rawFieldDescription.toString());


                  //String fieldComment =
                  //        f.commentText().isEmpty() ? "No description provided" : f.commentText();
                  //fieldDescription.append(fieldComment).append("\n");
                  fieldsInfo.append(fieldDescription).append("\n");
                });

      return fieldsInfo.toString();
    }
    return "";
  }
}
