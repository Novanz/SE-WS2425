import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();
        PremiumSubscriber premiumSubscriber = new PremiumSubscriber();
        FreeSubscriber freeSubscriber = new FreeSubscriber();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register Premium Subscriber");
            System.out.println("2. Register Free Subscriber");
            System.out.println("3. Unregister Premium Subscriber");
            System.out.println("4. Unregister Free Subscriber");
            System.out.println("5. Set News");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    newsFeed.registerObserver(premiumSubscriber);
                    System.out.println("Premium Subscriber registered.");
                    break;
                case 2:
                    newsFeed.registerObserver(freeSubscriber);
                    System.out.println("Free Subscriber registered.");
                    break;
                case 3:
                    newsFeed.removeObserver(premiumSubscriber);
                    System.out.println("Premium Subscriber unregistered.");
                    break;
                case 4:
                    newsFeed.removeObserver(freeSubscriber);
                    System.out.println("Free Subscriber unregistered.");
                    break;
                case 5:
                    System.out.println("Enter news content:");
                    String content = scanner.nextLine();
                    News news = new News(content);
                    newsFeed.setNews(news);
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
