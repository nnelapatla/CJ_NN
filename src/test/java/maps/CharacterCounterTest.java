package maps;

public class CharacterCounterTest {

    public static void main(String[] args) {
        // Test with a non-empty string
        String input1 = "test string";
        System.out.println("Input: " + input1);
        System.out.print("Output: ");
        CharacterCounter.countCharacters(input1);

        // Test with an empty string
        String input2 = "";
        System.out.println("\nInput: " + input2);
        System.out.print("Output: ");
        CharacterCounter.countCharacters(input2);

        // Test with a null string
        String input3 = null;
        System.out.println("\nInput: " + input3);
        System.out.print("Output: ");
        CharacterCounter.countCharacters(input3);
    }
}