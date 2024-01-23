package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramCheckTest {

    @Test
    public void testAreAnagrams() {
        // Test case 1: Anagrams with the same letters
        assertTrue(AnagramCheck.isAnagram("listen", "silent"));

        // Test case 2: Anagrams with different letter case
        assertTrue(AnagramCheck.isAnagram("Triangle", "integral"));

        // Test case 3: Non-anagrams
        assertFalse(AnagramCheck.isAnagram("hello", "world"));

        // Test case 4: Anagrams with spaces
        assertTrue(AnagramCheck.isAnagram("  debit card ", "bad credit"));

        // Test case 5: Anagrams with special characters
        assertTrue(AnagramCheck.isAnagram("astronomer", "moon starer"));
}
}

