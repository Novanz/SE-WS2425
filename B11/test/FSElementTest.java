import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FSElementTest {

    @Test
    void printNestedDirectoriesAndFiles() {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");
        Directory root = new Directory("/");

        dir1.addElement(file1);
        dir1.addElement(file2);

        dir2.addElement(file3);

        root.addElement(dir1);
        root.addElement(dir2);

        root.print("");
    }
}