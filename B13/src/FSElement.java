// Component
public interface FSElement {
    void print(String prefix);
    int getSize();
    void accept(FSVisitor visitor);
}
