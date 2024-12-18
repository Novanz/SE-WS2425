public class FS_Test {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");
        Directory root = new Directory("Root");

        dir1.addElement(file1);
        dir1.addElement(file2);

        dir2.addElement(file3);

        root.addElement(dir1);
        root.addElement(dir2);

        root.print("");
    }

}
