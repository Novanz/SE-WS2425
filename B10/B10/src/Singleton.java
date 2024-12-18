public class Singleton {
    protected static Singleton instance;

    protected Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Instance already exists");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Hilfsmethode zum Testen
    protected static void reset() {
        instance = null;
    }
}