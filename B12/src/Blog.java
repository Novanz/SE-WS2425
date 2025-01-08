public class Blog extends Resource {
    public Blog(String content) {
        super(content);
    }

    @Override
    public void display() {
        System.out.println("Blog: " + getContent());
    }
}