package lambdas;

import org.junit.jupiter.api.Test;
import lambdas.StringLengthGrp;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringLenghtGrpTest {

        @Test
        void testGroupStringsByLength() {
            List<String> input = Arrays.asList("cat", "dog", "lion", "elephant", "bird", "fish");
            Map<Integer, List<String>> expected = new HashMap<>();
            expected.put(3, Arrays.asList("cat", "dog"));
            expected.put(4, Arrays.asList("lion", "bird", "fish"));
            expected.put(8, Arrays.asList("elephant"));

            Map<Integer, List<String>> result = StringLengthGrp.groupStringsByLength(input);

            assertEquals(expected.size(), result.size());
            expected.forEach((length, strings) -> assertEquals(strings, result.get(length)));
        }
    }


