package randomprograms;
import static org.junit.Assert.*;
import randomprograms.CheckStringRotation;
import org.junit.Test;
public class CheckStringRotationTest {
    @Test
    public void testIsRotationTrue() {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        assertTrue(CheckStringRotation.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationFalse() {
        String str1 = "hello";
        String str2 = "world";
        assertFalse(CheckStringRotation.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationSameString() {
        String str1 = "abcde";
        assertTrue(CheckStringRotation.isRotation(str1, str1));
    }

    @Test
    public void testIsRotationEmptyString() {
        String str1 = "";
        String str2 = "";
        assertTrue(CheckStringRotation.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationNullString() {
        String str1 = null;
        String str2 = null;
        assertFalse(CheckStringRotation.isRotation(str1, str2));
    }
}
