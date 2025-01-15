public class FSVisitorTest {
    public static void main(String[] args) {
        // Erstelle Teststruktur
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 100);
        Directory dir1 = new Directory("dir1");
        Directory root = new Directory("root");

        dir1.addElement(file1);
        dir1.addElement(file2);
        root.addElement(dir1);

        // Verwende PrintVisitor
        PrintVisitor printVisitor = new PrintVisitor();
        root.accept(printVisitor);

        // Verwende InfoVisitor
        InfoVisitor infoVisitor = new InfoVisitor();
        root.accept(infoVisitor);
        infoVisitor.printStatistics();
    }
}