package randomprograms;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindRepeatedDigitsTest {


        @Test
        public void testFindRepeatedDigits() {
            // Redirect System.out to capture printed output
            ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStreamCaptor));

            // Call the method with a sample number
            FindRepeatedDigits.findRepeatedDigits(122345556);

            // Get the printed output
            String output = outputStreamCaptor.toString().trim();

            // Restore System.out
            System.setOut(System.out);

            // Expected output
            String expectedOutput = "Repeated digits in the number:\n2\n5";

            // Assert that the output matches the expected output
            assertEquals(expectedOutput, output);
        }
    }


