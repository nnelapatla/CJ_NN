package threadss;
import org.junit.Test;
public class DeadlockExampleTest {

        @Test(timeout = 5000) // Timeout after 5 seconds to prevent test from hanging indefinitely
        public void testDeadlock() throws InterruptedException {
            // Create a separate thread to call createDeadlock() method
            Thread deadlockThread = new Thread(DeadlockExample::createDeadlock);

            // Start the thread
            deadlockThread.start();

            // Wait for a certain amount of time to check if the threads are deadlocked
            deadlockThread.join();
        }
    }


