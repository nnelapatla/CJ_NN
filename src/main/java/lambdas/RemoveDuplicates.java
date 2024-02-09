package lambdas;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
        public static List<Integer> removeDuplicates(List<Integer> list) {
            return list.stream()
                    .distinct()
                    .collect(Collectors.toList());
        }
    }
