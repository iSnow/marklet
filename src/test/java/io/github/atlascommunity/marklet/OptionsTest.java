package io.github.atlascommunity.marklet;
/*
import static io.github.atlascommunity.marklet.Options.parse;
import static io.github.atlascommunity.marklet.Options.validOptions;*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
/*
import com.sun.javadoc.DocErrorReporter;
import com.sun.javadoc.RootDoc;
*/
class OptionsTest {

 /* @Test
  void testParse() {
    RootDoc mockDoc = mock(RootDoc.class);
    String[][] options = new String[][] {{"-d", "doc"}, {"-e", "md"}};
    when(mockDoc.options()).thenReturn(options);
    assertEquals("doc", parse(mockDoc).getOutputDirectory());

    String[][] optionsWithJavadocArgs = new String[][] {{"-d", "doc"}, {"-protected", null}};
    when(mockDoc.options()).thenReturn(optionsWithJavadocArgs);
    assertEquals("doc", parse(mockDoc).getOutputDirectory());
  }

  @Test
  void testOptionsValidation() {
    DocErrorReporter reporter = mock(DocErrorReporter.class);
    String[][] badOptions = new String[2][3];
    badOptions[0][0] = "-foo";
    badOptions[0][1] = "this";
    badOptions[0][2] = "that";
    badOptions[1][0] = "-bar";
    badOptions[1][1] = "other";
    doNothing().when(reporter).printError(anyString());
    assertFalse(validOptions(badOptions, reporter));

    String[][] goodOptions = new String[2][2];
    goodOptions[0][0] = "-doclet";
    goodOptions[0][1] = "marklet";
    goodOptions[1][0] = "-d";
    goodOptions[1][1] = "doc";
    assertTrue(validOptions(goodOptions, reporter));
  }*/
}
