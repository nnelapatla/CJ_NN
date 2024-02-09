package exceptions;

public class StringToIntConverter {

    public static int convertStringToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            return -1; // Or any other default value or handling you prefer
        }
    }

}
