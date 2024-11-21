import java.util.ArrayList;
import java.util.List;

public class TestLib {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        var mediums = new ArrayList<>();

        mediums.add(new Medium("Effective Java", "Joshua Bloch", "Addison-Wesley", 2008, 9780134685991, false, "Programming", 1));
        mediums.add(new Medium("Clean Code", "Robert C. Martin", "Prentice Hall", 2008, 9780132350886, false, "Software Engineering", 2));
        mediums.add(new Medium("The Pragmatic Programmer", "Andrew Hunt", "Addison-Wesley", 1999, 9780201616224, false, "Software Development", 3));
        mediums.add(new Medium("Design Patterns", "Erich Gamma", "Addison-Wesley", 1994, 9780201633610, false, "Software Design", 4));
        mediums.add(new Medium("Refactoring", "Martin Fowler", "Addison-Wesley", 1999, 9780201485677, false, "Software Engineering", 5));
        mediums.add(new Medium("Code Complete", "Steve McConnell", "Microsoft Press", 2004, 9780735619678, false, "Programming", 6));
        mediums.add(new Medium("Introduction to Algorithms", "Thomas H. Cormen", "MIT Press", 2009, 9780262033848, false, "Algorithms", 7));
        mediums.add(new Medium("The Art of Computer Programming", "Donald E. Knuth", "Addison-Wesley", 1968, 9780201896831, false, "Computer Science", 8));
        mediums.add(new Medium("Head First Design Patterns", "Eric Freeman", "O'Reilly Media", 2004, 9780596007126, false, "Software Design", 9));
        mediums.add(new Medium("Java Concurrency in Practice", "Brian Goetz", "Addison-Wesley", 2006, 9780321349606, false, "Programming", 10));
    }
}
