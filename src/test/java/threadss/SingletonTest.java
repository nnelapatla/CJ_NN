package threadss;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get the instance of Singleton class
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check that both instances are the same
        assertSame(instance1, instance2);
    }
}
