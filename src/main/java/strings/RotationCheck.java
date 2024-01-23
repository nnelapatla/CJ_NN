package strings;

public class RotationCheck {

        // Method to check if one string is a rotation of another string
        public static boolean isRotation(String s1, String s2) {
            // Check if lengths are equal and both strings are not empty
            if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
                return false;
            }

            // Concatenate the first string with itself
            String concatenatedString = s1 + s1;

            // Check if the second string is a substring of the concatenated string
            return concatenatedString.contains(s2);
        }
    }

