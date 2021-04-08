package io.github.atlascommunity.marklet;

import static java.lang.Boolean.parseBoolean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
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
 */
public final class Options {

  /** Option name for the target output directory. (`-d`) * */
  private static final String OUTPUT_DIRECTORY_OPTION = "-d";

  /** Option name for the file ending (`-e`) * */
  private static final String FILE_ENDING_OPTION = "-e";

  /** Option name for create badge flag (`-b`) * */
  private static final String CREATE_BADGE_OPTION = "-b";

  /** Number of token per option. * */
  private static final Map<String, Integer> OPTIONS_COUNT = new HashMap<>();

  /** Javadoc standard options * */
  private static final List<String> OPTIONS_TO_EXCLUDE =
      Arrays.asList(
          "-doclet",
          "-docletpath",
          "-classpath",
          "-encoding",
          "-protected",
          "-public",
          "-private",
          "-sourcepath");

  /** List of valid options. * */
  private static final List<String> VALID_OPTIONS =
      Arrays.asList(OUTPUT_DIRECTORY_OPTION, FILE_ENDING_OPTION, CREATE_BADGE_OPTION);

  /* Number of tokens per option **/
  static {
    OPTIONS_COUNT.put(OUTPUT_DIRECTORY_OPTION, 2);
    OPTIONS_COUNT.put(FILE_ENDING_OPTION, 2);
    OPTIONS_COUNT.put(CREATE_BADGE_OPTION, 2);
  }

  /** Default output directory to use. * */
  private static final String DEFAULT_OUTPUT_DIRECTORY = "javadoc/";

  /** Default output file ending (`md`) * */
  private static final String DEFAULT_FILE_ENDING = "md";

  /** Output directory file are generated in. * */
  @Getter private final String outputDirectory;

  /** Extension to use for generated file. * */
  @Getter private final String fileEnding;

  /** Add "generated by" badge to generated doc or not. * */
  @Getter private final boolean hasBadge;

  /** Default constructor. Sets options with their default parameters if available. */
  private Options(final Map<String, String> options) {

    this.outputDirectory = options.getOrDefault(OUTPUT_DIRECTORY_OPTION, DEFAULT_OUTPUT_DIRECTORY);
    this.fileEnding = options.getOrDefault(FILE_ENDING_OPTION, DEFAULT_FILE_ENDING);
    this.hasBadge = parseBoolean(options.getOrDefault(CREATE_BADGE_OPTION, "false"));
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

    List<String> optionsList =
        Arrays.stream(options)
            .filter(Objects::nonNull)
            .filter(docletOptionsOnly())
            .map(option -> option[0])
            .collect(Collectors.toList());

    boolean isValid = VALID_OPTIONS.containsAll(optionsList);
    if (!isValid) {
      reporter.printError("Current values: " + optionsList.toString());
      reporter.printError("Only this options allowed: " + String.join(",", VALID_OPTIONS));
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
  public static Options parse(final RootDoc root) {
    // NOTE :	Work since we only have 2D option.
    //			Consider redesign option parsing if this predicate change.
    final Map<String, String> options =
        Arrays.stream(root.options())
            .filter(docletOptionsOnly())
            .collect(Collectors.toMap(option -> option[0], option -> option[1], (a, b) -> b));

    return new Options(options);
  }

  /**
   * Predicate to filter current doclet options only and exclude javadoc options
   *
   * @return filter function
   */
  private static Predicate<String[]> docletOptionsOnly() {
    return o -> !OPTIONS_TO_EXCLUDE.contains(o[0]);
  }
}
