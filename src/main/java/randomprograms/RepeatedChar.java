package randomprograms;

import java.util.HashMap;
import java.util.Map;
public class RepeatedChar {


        public static void main(String[] args) {
            String str = "hello world";
            printRepeatedCharacters(str);
        }

        public static void printRepeatedCharacters(String str) {
            // Create a HashMap to store character counts
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Convert the string to char array
            char[] charArray = str.toCharArray();

            // Iterate through each character in the array
            for (char ch : charArray) {
                // If the character is already present in the map, increment its count
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    // If the character is not present, add it to the map with count as 1
                    charCountMap.put(ch, 1);
                }
            }

            // Iterate through the map to print repeated characters
            System.out.print("Repeated characters in the string:\n");
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
                }
            }
        }
    }
