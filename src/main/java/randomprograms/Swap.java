package randomprograms;

public class Swap {
        public static void swapIntegers(int a, int b) {
            // Perform the swap
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }



