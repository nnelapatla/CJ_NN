package randomprograms;
import randomprograms.CharCaseConverter;
import static org.junit.Assert.*;
import org.junit.Test;
public class CharCaseConverterTest {
    @Test
    public void testConvertCase() {
        String input = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, CharCaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, CharCaseConverter.convertCase(input));
    }
}
