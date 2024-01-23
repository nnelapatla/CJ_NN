package strings;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

    public class RotationCheckTest {

        @Test
        public void testIsRotation() {
            // Test case 1: Rotations
            assertTrue(RotationCheck.isRotation("abcde", "cdeab"));

            // Test case 2: Not rotations with different lengths
            assertFalse(RotationCheck.isRotation("hello", "world"));

            // Test case 3: Not rotations with empty strings
            assertFalse(RotationCheck.isRotation("", "abcd"));

            // Test case 4: Rotations with spaces
            assertTrue(RotationCheck.isRotation("hello world", "worldhello "));

            // Test case 5: Rotations with special characters
            assertTrue(RotationCheck.isRotation("!@#$%", "%!@#$"));

            // Test case 6: Rotations with numbers
            assertTrue(RotationCheck.isRotation("12345", "34512"));

            // Test case 7: Not rotations with different characters
            assertFalse(RotationCheck.isRotation("abc", "def"));

            // Test case 8: Rotations with repeated characters
            assertTrue(RotationCheck.isRotation("aabbaabb", "bbaabbaa"));

            // Test case 9: Rotations with same string
            assertTrue(RotationCheck.isRotation("abc", "abc"));

            // Test case 10: Rotations with single-character strings
            assertTrue(RotationCheck.isRotation("a", "a"));
        }


}
