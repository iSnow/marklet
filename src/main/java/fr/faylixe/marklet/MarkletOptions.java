package fr.faylixe.marklet;

import static java.lang.Boolean.parseBoolean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sun.javadoc.DocErrorReporter;
import com.sun.javadoc.Doclet;
import com.sun.javadoc.RootDoc;

import lombok.Getter;

/**
 * Class that reads and stores provided options for javadoc execution. Options that we care about
 * are :
 *
 * <p>* `-d` specifies the output directory (default: `javadocs`) * `-e` specifies the file ending
 * for files to be created (default `md`) * `-l` specifies the file ending used in internal links
 * (default `md`)
 *
 * <p>> The default options are ideal if you want to serve the documentation using GitHub's >
 * built-in README rendering. If you are using a tool like Slate, change the options as follows: ```
 * $ javadoc -doclet fr.faylixe.marklet.Marklet -e html.md -l html … ```
 *
 * @author fv
 */
public final class MarkletOptions {

  /** Option name for the target output directory. * */
  private static final String OUTPUT_DIRECTORY_OPTION = "-d";

  /** Option name for the target output directory for readme file. * */
  private static final String README_DIRECTORY_OPTION = "-r";

  /** Option name for the file ending (`-e`) * */
  private static final String FILE_ENDING_OPTION = "-e";

  /** Option name for the link ending (`-l`) * */
  private static final String LINK_ENDING_OPTION = "-l";

  /** Option name for create badge flag (`-b`) * */
  private static final String CREATE_BADGE_OPTION = "-b";

  /** Option name for annotation based processing * */
  private static final String ANNOTATED_CLASS_ONLY = "-a";

  /** Number of token per option. * */
  private static final Map<String, Integer> OPTIONS_COUNT = new HashMap<>();

  /** List of valid options. * */
  private static final List<String> VALID_OPTIONS =
      Arrays.asList(
          OUTPUT_DIRECTORY_OPTION,
          README_DIRECTORY_OPTION,
          FILE_ENDING_OPTION,
          LINK_ENDING_OPTION,
          CREATE_BADGE_OPTION,
          ANNOTATED_CLASS_ONLY);

  static {
    OPTIONS_COUNT.put(OUTPUT_DIRECTORY_OPTION, 2);
    OPTIONS_COUNT.put(README_DIRECTORY_OPTION, 2);
    OPTIONS_COUNT.put(FILE_ENDING_OPTION, 2);
    OPTIONS_COUNT.put(LINK_ENDING_OPTION, 2);
    OPTIONS_COUNT.put(CREATE_BADGE_OPTION, 2);
    OPTIONS_COUNT.put(ANNOTATED_CLASS_ONLY, 2);
  }

  /** Default output directory to use. * */
  private static final String DEFAULT_OUTPUT_DIRECTORY = "javadoc/";

  /** Default output file ending (`md`) * */
  private static final String DEFAULT_FILE_ENDING = "md";

  /** Default ending for internal links (`md`). * */
  private static final String DEFAULT_LINK_ENDING = "md";

  /** Output directory file are generated in. * */
  @Getter private final String outputDirectory;

  /** Output directory for Readme file. * */
  @Getter private final String readmeDirectory;

  /** Extension to use for generated file. * */
  @Getter private final String fileEnding;

  /** Extension to use for generated link. * */
  @Getter private final String linkEnding;

  /** Add "generated by" badge to generated doc or not. * */
  @Getter private final boolean badgeNeeded;

  /** Process classes with specified annotation or use scopes from javadoc-plugin. * */
  @Getter private final boolean annotationProcessingNeeded;

  /** Which annotations * */
  @Getter private final String annotationToProcess;

  /** Default constructor. Sets options with their default parameters if available. */
  private MarkletOptions(final Map<String, String> options) {

    this.outputDirectory = options.getOrDefault(OUTPUT_DIRECTORY_OPTION, DEFAULT_OUTPUT_DIRECTORY);
    this.readmeDirectory = options.getOrDefault(README_DIRECTORY_OPTION, DEFAULT_OUTPUT_DIRECTORY);
    this.fileEnding = options.getOrDefault(FILE_ENDING_OPTION, DEFAULT_FILE_ENDING);
    this.linkEnding = options.getOrDefault(LINK_ENDING_OPTION, DEFAULT_LINK_ENDING);
    this.badgeNeeded = parseBoolean(options.getOrDefault(CREATE_BADGE_OPTION, "false"));
    this.annotationProcessingNeeded = !options.get(ANNOTATED_CLASS_ONLY).isEmpty();
    this.annotationToProcess = options.getOrDefault(ANNOTATED_CLASS_ONLY, null);
  }

  /**
   * Options validation method.
   *
   * @param options Options from command line.
   * @param reporter Reporter instance to use in case of error.
   * @return <tt>true</tt> if given set of options are valid, <tt>false</tt> otherwise.
   * @see Doclet#validOptions(String[][], DocErrorReporter)
   */
  public static boolean validOptions(final String[][] options, final DocErrorReporter reporter) {

    boolean isValid = VALID_OPTIONS.containsAll(Arrays.asList(options[0]));
    if (!isValid) {
      String validOptionsString = String.join(",", VALID_OPTIONS);
      reporter.printError("Only this options allowed: " + validOptionsString);
    }

    return isValid;
  }

  /**
   * Computes number of arguments (as token) for the given option.
   *
   * @param option Target option to get token number for.
   * @return Number of token expected for the given option.
   * @see Doclet#optionLength(String)
   */
  public static int optionLength(final String option) {

    return OPTIONS_COUNT.getOrDefault(option, 0);
  }

  /**
   * Static factory.
   *
   * @param root program structure information root
   * @return Built options instance.
   */
  public static MarkletOptions parse(final RootDoc root) {

    // NOTE :	Work since we only have 2D option.
    //			Consider redesign option parsing if this predicate change.
    final Map<String, String> options =
        Arrays.stream(root.options())
            .collect(Collectors.toMap(option -> option[0], option -> option[1], (a, b) -> b));

    return new MarkletOptions(options);
  }
}
