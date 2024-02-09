package threadss;
public class EvenOddPrinter {

    public static void printEvenNumbers() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to slow down the output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to slow down the output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
