import java.util.ArrayList;
import java.util.List;

public class Feed {
    private List<Observer> observer = new ArrayList();

    public void registerObserver(Observer observer) {
        this.observer.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observer.remove(observer);
    }
    public void notifyObservers(News news) {
        for (Observer observer : this.observer) {
            observer.update(news);
        }
    }
}
