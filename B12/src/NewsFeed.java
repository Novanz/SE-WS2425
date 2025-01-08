public class NewsFeed extends Feed {
    private News news;

    public News getNews() {
        return this.news;
    }
    public void setNews(News news) {
        this.news = news;
        this.notifyObservers(news);
    }
}
