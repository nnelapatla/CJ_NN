package strings;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindVowelsTest {


        @Test
        public void testCountVowels() {
            // Test case 1: String with no vowels
            assertEquals(0, FindVowels.countVowels("xyz"));

            // Test case 2: String with all vowels
            assertEquals(5, FindVowels.countVowels("aeiou"));

            // Test case 3: String with a mix of vowels and consonants
            assertEquals(2, FindVowels.countVowels("hello"));


            // Test case 4: Empty string
            assertEquals(0, FindVowels.countVowels(""));

            // Test case 5: String with uppercase and lowercase vowels
            assertEquals(10, FindVowels.countVowels("aAEeIiOoUu"));

            // Test case 6: String with numbers and special characters
            assertEquals(1, FindVowels.countVowels("h3llo!"));

            // Test case 7: String with spaces
            assertEquals(3, FindVowels.countVowels("hello world"));

            // Test case 8: String with only spaces
            assertEquals(0, FindVowels.countVowels("   "));

            // Test case 9: String with non-alphabetic characters
            assertEquals(0, FindVowels.countVowels("12345"));

            // Test case 10: String with non-English characters
            assertEquals(0, FindVowels.countVowels("áéî"));
        }
    }

