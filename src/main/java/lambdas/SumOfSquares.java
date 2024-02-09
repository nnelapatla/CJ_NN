package lambdas;
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {


    public static int calculateSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)  // Filter positive numbers
                .mapToInt(n -> n * n) // Square each positive number
                .sum(); // Calculate sum
    }
}