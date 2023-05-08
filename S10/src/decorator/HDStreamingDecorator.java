package decorator;

public class HDStreamingDecorator extends SubscriptionDecorator{
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", vizualizare in claitate HD";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3.0;
    }
}
