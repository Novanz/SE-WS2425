public class SingletonTest {
    public static void main(String[] args) {
        testSingleton();
        testThreadSafeSingleton();
        testMultiton();
    }

    private static void testSingleton() {
        System.out.println("=== Testing Basic Singleton ===");
        Singleton.reset();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Same instance test: " + (s1 == s2));
        System.out.println("Instance hash: " + s1.hashCode());
    }

    private static void testThreadSafeSingleton() {
        System.out.println("\n=== Testing Thread-Safe Singleton ===");
        ThreadSafeSingleton.reset();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
                System.out.println("Thread " + Thread.currentThread().getId() +
                        " -> Instance hash: " + instance.hashCode());
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void testMultiton() {
        System.out.println("\n=== Testing Multiton ===");
        System.setProperty("multiton.instances", "3");
        Multiton.reset();

        System.out.println("Creating 7 instance requests:");
        for (int i = 0; i < 7; i++) {
            Multiton instance = Multiton.getInstance();
            System.out.println("Request " + i + " -> Instance hash: " + instance.hashCode());
        }
    }
}
