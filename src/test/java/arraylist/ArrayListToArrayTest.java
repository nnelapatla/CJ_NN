package arraylist;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListToArrayTest {


        @Test
        public void testConvertArrayListToArray() {
            // Arrange
            ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));

            // Act
            String[] resultArray = ArrayListToArray.convertArrayListToArray(inputList);

            // Assert
            assertNotNull(resultArray);
            assertEquals(inputList.size(), resultArray.length);

            // Check if the elements are the same
            for (int i = 0; i < inputList.size(); i++) {
                assertEquals(inputList.get(i), resultArray[i]);
            }
        }
    }


