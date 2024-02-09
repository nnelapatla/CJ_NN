package threadss;

public class DeadlockExample {

        // Shared resources
        private static final Object resource1 = new Object();
        private static final Object resource2 = new Object();

        public static void createDeadlock() {
            Thread thread1 = new Thread(() -> {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " acquired lock on resource1");
                    try {
                        Thread.sleep(100); // Simulate some processing time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting to acquire lock on resource2");
                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " acquired lock on resource2");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " acquired lock on resource2");
                    try {
                        Thread.sleep(100); // Simulate some processing time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " waiting to acquire lock on resource1");
                    synchronized (resource1) {
                        System.out.println(Thread.currentThread().getName() + " acquired lock on resource1");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }


