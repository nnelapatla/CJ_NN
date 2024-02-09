package exceptions;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringToIntConverterTest {

    @Test
    public void testConvertStringToInt() {
        assertEquals(23, StringToIntConverter.convertStringToInt("23"));
        assertEquals(-1, StringToIntConverter.convertStringToInt("45.67"));
        assertEquals(-1, StringToIntConverter.convertStringToInt("test"));
        assertEquals(-1, StringToIntConverter.convertStringToInt("123f"));
    }
}

