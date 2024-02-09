package threadss;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it's null
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and fields can be added here as needed
}
