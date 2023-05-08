package decorator;

public class OfflineViewingDecorator extends SubscriptionDecorator {
    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", vizualizare offline";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+5.0;
    }
}
