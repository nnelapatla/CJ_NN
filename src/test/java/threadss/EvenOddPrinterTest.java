package threadss;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class EvenOddPrinterTest {

    @Test
    public void testPrintEvenNumbers() {
        Thread evenThread = new Thread(EvenOddPrinter::printEvenNumbers);
        evenThread.start();
        try {
            evenThread.join(); // Wait for the thread to finish execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintOddNumbers() {
        Thread oddThread = new Thread(EvenOddPrinter::printOddNumbers);
        oddThread.start();
        try {
            oddThread.join(); // Wait for the thread to finish execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


