public class FreeSubscriber implements Observer {
    private News news;

    public void update(News news) {
        this.news = news;
        this.display();
    }
    public void display() {
        System.out.println("Free Subscriber received news: " + "Ads " + this.news);
    }
}
