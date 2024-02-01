package randomprograms;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter your number:");
        int num = scanner.nextInt();
        scanner.close();

        if (num%2 == 0)

            System.out.println(num+ " This is an even number");

        else
            System.out.println(num+ " This is an odd number");
    }

}
