package io.github.atlascommunity.marklet.constants;

import lombok.experimental.UtilityClass;

/**
 * Enumerations of text constant used during documentation generation.
 *
 * @author fv
 */
@UtilityClass
public final class Labels {

  /** Label for package. * */
  public static final String PACKAGE = "Package";

  /** Label for interface. * */
  public static final String INTERFACE = "Interface";

  /** Label for classe. * */
  public static final String CLASS = "Class";

  /** Label for annotation. * */
  public static final String ANNOTATION = "Annotation";

  /** Label for enumeration. * */
  public static final String ENUMERATION = "Enumeration";

  /** Label for interfaces. * */
  public static final String INTERFACES = "Interfaces";

  /** Label for classes. * */
  public static final String CLASSES = "Classes";

  /** Label for annotations. * */
  public static final String ANNOTATIONS = "Annotations";

  /** Label for enumerations. * */
  public static final String ENUMERATIONS = "Enumerations";

  /** Label for constructor. * */
  public static final String CONSTRUCTORS = "Constructors";

  /** Label for methods. * */
  public static final String METHODS = "Methods";

  /** Label for fields. * */
  public static final String FIELDS = "Fields";

  /** Label for name. * */
  public static final String NAME = "Name";

  /** Label for throws. * */
  public static final String THROWS = "Throws";

  /** Label for returns. * */
  public static final String RETURNS = "Returns";

  /** Label for parameters. * */
  public static final String PARAMETERS = "Parameters";

  /** Label for summary. * */
  public static final String SUMMARY = "Summary";

  /** Header labels for methods summary. * */
  public static final String[] METHODS_SUMMARY_HEADERS = {"Type and modifiers", "Method signature"};

  /** Header labels for fields summary. * */
  public static final String[] FIELDS_SUMMARY_HEADERS = {"Type and modifiers", "Field name"};

  /** Header labels for constructors summary. * */
  public static final String[] CONSTRUCTOR_SUMMARY_HEADERS = {"Visibility", "Signature"};

  /** Header label for the interface hierachy. * */
  public static final String INTERFACE_HIERARCHY_HEADER = "All implemented interfaces :";
}
