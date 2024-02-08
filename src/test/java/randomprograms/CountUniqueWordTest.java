package randomprograms;
import randomprograms.CountUniqueWord;
import static org.junit.Assert.*;
import org.junit.Test;
public class CountUniqueWordTest {
    @Test
    public void testCountUniqueWords() {
        String str = "Java is a programming language. Java is used for development.";
        assertEquals(6, CountUniqueWord.countUniqueWords(str));
    }

    @Test
    public void testCountUniqueWordsEmptyString() {
        String str = "";
        assertEquals(1, CountUniqueWord.countUniqueWords(str));
    }

    @Test
    public void testCountUniqueWordsSingleWord() {
        String str = "Java";
        assertEquals(1, CountUniqueWord.countUniqueWords(str));
    }

    @Test
    public void testCountUniqueWordsCaseSensitive() {
        String str = "Java java Java";
        assertEquals(1, CountUniqueWord.countUniqueWords(str));
    }


}
