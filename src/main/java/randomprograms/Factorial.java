package randomprograms;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //create an new scanner object to read the values from the user
        Scanner number = new Scanner(System.in);
        int num;
        long factorial = 1;
        System.out.println("Enter your number:");
        num = number.nextInt();
        number.close();

        if (num < 0) {

            System.out.println("Given number is invalid");
        } else if (num <= 1) {
            System.out.printf("%d! = %d", num, factorial);
        } else {
            for (int i = num; i >= 2; i--) {

                factorial = factorial * i;

            }
            System.out.println(factorial + "This is the result");
        }

    }
}

