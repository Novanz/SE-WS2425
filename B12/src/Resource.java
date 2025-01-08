public abstract class Resource {
    private final String content;

    public Resource(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }

    public abstract void display();
}
