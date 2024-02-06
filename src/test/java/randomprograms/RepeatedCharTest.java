package randomprograms;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RepeatedCharTest {
        @Test
        public void testPrintRepeatedCharacters() {
            // Test input string
            String str = "hello world";

            // Expected output
            String expectedOutput = "Repeated characters in the string:\n" +
                    "l - 3 times\n" +
                    "o - 2 times\n";

            // Redirect standard output to a string buffer for comparison
            java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
            System.setOut(new java.io.PrintStream(outContent));

            // Call the method to be tested
            RepeatedChar.printRepeatedCharacters(str);

            // Restore standard output
            System.setOut(System.out);

            // Convert output content to string
            String actualOutput = outContent.toString();

            // Assert the output
            assertEquals(expectedOutput, actualOutput);
        }
    }

