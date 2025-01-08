public class PremiumSubscriber implements Observer {
    private News news;

    public void update(News news) {
        this.news = news;
        this.display();
    }
    public void display() {
        System.out.println("Premium Subscriber received news: " + this.news);
    }

}
