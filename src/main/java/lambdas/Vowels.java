package lambdas;
import java.util.Arrays;
import java.util.List;

public class Vowels {

        public static void main(String[] args) {
            List<String> stringLists = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");

            // Using Java streams and lambda expressions
            stringLists.stream()
                    .filter(n -> containsVowels(n))
                    .forEach(n -> System.out.println(n + " - Number of vowels: " + countVowels(n)));
        }

        // Lambda expression to check if a string contains vowels
        private static boolean containsVowels(String str) {
            return str.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) != -1);
        }

        // Lambda expression to count the number of vowels in a string
        private static long countVowels(String str) {
            return str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        }
    }


