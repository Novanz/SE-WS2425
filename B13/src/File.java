public class File implements FSElement {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "- " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
