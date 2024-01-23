package strings;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordTest {

        @Test
        public void testReverseWordsInSentence() {
            // Test case 1: Regular sentence
            assertEquals("olleH dlroW", ReverseWord.reverseWordsInSentence("Hello World"));

            // Test case 2: Sentence with multiple spaces between words
            assertEquals("abc cba", ReverseWord.reverseWordsInSentence("cba abc"));

            // Test case 3: Empty sentence
            assertEquals("", ReverseWord.reverseWordsInSentence(""));

            // Test case 4: Sentence with a single word
            assertEquals("madam", ReverseWord.reverseWordsInSentence("madam"));

            // Test case 5: Sentence with leading and trailing spaces
            assertEquals("dcba abcd", ReverseWord.reverseWordsInSentence("abcd dcba"));

            // Test case 6: Sentence with special characters
            assertEquals("$#@! )(*&%", ReverseWord.reverseWordsInSentence("!@#$ %&*()"));

            // Test case 7: Sentence with numbers
            assertEquals("54321 12345", ReverseWord.reverseWordsInSentence("12345 54321"));
        }

        @Test
        public void testReverseString() {
            // Test case 1: Regular string
            assertEquals("tac", ReverseWord.reverseString("cat"));

            // Test case 2: Empty string
            assertEquals("", ReverseWord.reverseString(""));

            // Test case 3: String with a single character
            assertEquals("a", ReverseWord.reverseString("a"));

            // Test case 4: String with special characters
            assertEquals("@!#$ ^%", ReverseWord.reverseString("%^ $#!@"));

            // Test case 5: String with numbers
            assertEquals("54321", ReverseWord.reverseString("12345"));
        }


}
