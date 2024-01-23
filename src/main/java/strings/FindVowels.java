package strings;

import java.util.Scanner;

public class FindVowels {

        // Method to count the number of vowels in a given string
        static int countVowels(String str) {
            int count = 0;

            // Convert the string to lowercase to make the comparison case-insensitive
            str = str.toLowerCase();

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            return count;
        }
    }
