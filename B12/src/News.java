public class News extends Resource {
    public News(String content) {
        super(content);
    }

    @Override
    public void display() {
        System.out.println("News: " + getContent());
    }
}
