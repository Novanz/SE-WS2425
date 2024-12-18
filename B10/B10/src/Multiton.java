public class Multiton {
    private static Multiton[] instances;
    private static int counter = 0;
    private static int maxInstances;

    static {
        maxInstances = Integer.parseInt(System.getProperty("multiton.instances", "3"));
        instances = new Multiton[maxInstances];
    }

    private Multiton() {}

    public static synchronized Multiton getInstance() {
        if (instances[counter % maxInstances] == null) {
            instances[counter % maxInstances] = new Multiton();
        }
        counter++;
        return instances[(counter - 1) % maxInstances];
    }

    // Hilfsmethode zum Testen
    protected static void reset() {
        instances = new Multiton[maxInstances];
        counter = 0;
    }
}
