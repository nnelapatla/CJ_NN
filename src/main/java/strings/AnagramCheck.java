package strings;
public class AnagramCheck {

    // Method to check if two strings are anagrams
    static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert the strings to char arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort the char arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}

