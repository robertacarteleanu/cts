package decorator;

import decorator.BasicSubscription;
import decorator.HDStreamingDecorator;
import decorator.OfflineViewingDecorator;
import decorator.Subscription;

public class Main {
    public static void main(String[] args) {
        Subscription subscription=new BasicSubscription();
        subscription=new OfflineViewingDecorator(subscription);
        subscription=new HDStreamingDecorator(subscription);

        System.out.println("Descriere : "+subscription.getDescription());
        System.out.println("Pret : "+subscription.getPrice());
    }
}