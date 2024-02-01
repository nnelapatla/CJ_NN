package randomprograms;
import java.util.Scanner;
public class Swap {

//    public static void main(String[] args) {
////  Initialize two integer variables
//        int num1,num2;
//        // Create a Scanner object to read input from the user
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your first number:");
//        num1 = scan.nextInt();
//
//        System.out.println("Enter your second number:");
//        num2 = scan.nextInt();
//        scan.close();
//        // Print the values before swapping
//        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

    public int[] swap(int num1, int num2){


       num1 = num1 + num2;  // Sum of both numbers is stored in num1
       num2 = num1 - num2;  // Subtracting the original value of num2 gives the original value of num1, stored in num2
       num1 = num1 - num2;  // Subtracting the new value of num2 from the sum gives the original value of num2, stored in num1
// Step 2: Print the values after swapping
//        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
int result[] = {num1, num2};
return result;
    }
}



