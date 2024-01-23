package strings;

public class ReverseWord {

        // Method to reverse each word in a sentence
        static String reverseWordsInSentence(String sentence) {
            // Split the sentence into words
            String[] words = sentence.split("\\s");

            // Reverse each word and concatenate them
            StringBuilder reversedSentence = new StringBuilder();
            for (String word : words) {
                String reversedWord = reverseString(word);
                reversedSentence.append(reversedWord).append(" ");
            }

            // Remove the trailing space and return the result
            return reversedSentence.toString().trim();
        }

        // Method to reverse a string
        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                // Swap characters at start and end indices
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                // Move indices towards each other
                start++;
                end--;
            }

            return new String(charArray);
        }
    }


