package io.github.atlascommunity.marklet;

import static io.github.atlascommunity.marklet.MarkletOptions.validOptions;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.sun.javadoc.DocErrorReporter;

class MarkletOptionsTest {

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
  }
}
