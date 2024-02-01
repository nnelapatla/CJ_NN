package randomprograms;
import java.util.Scanner;
public class AddTwoNum {

public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        // First input
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        // Second input
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        scan.close();
        int result = num1 + num2;
        System.out.println("Sum of two numbers is: " + result);
    }

}
