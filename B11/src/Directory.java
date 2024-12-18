import java.util.ArrayList;
import java.util.List;

public class Directory implements FSElement {
    private String name;
    private final List<FSElement> elements = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory(String name) {
        this.name = name;
    }

    public void addElement(FSElement element) {
        elements.add(element);
    }

    public void removeElement(FSElement element) {
        elements.remove(element);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "+ " + name);
        for (FSElement element : elements) {
            element.print(prefix + "  ");
        }
    }

}
