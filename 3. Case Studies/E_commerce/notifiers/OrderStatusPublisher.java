package E_commerce.notifiers;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusPublisher implements Publisher {
    private final List<Subscriber> subscribers;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public OrderStatusPublisher(List<Subscriber> subscribers) {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void notifyAll(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(message);
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
}
