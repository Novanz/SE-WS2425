public class ThreadSafeSingleton extends Singleton {
    private ThreadSafeSingleton() {
        super();
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return (ThreadSafeSingleton) instance;
    }
}
