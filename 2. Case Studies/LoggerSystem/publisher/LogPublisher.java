package LoggerSystem.publisher;

import java.util.ArrayList;
import java.util.List;

import LoggerSystem.subcriber.Subscriber;

public class LogPublisher implements Publisher {
    private final List<Subscriber> subcribers;

    @Override
    public void notify(String message) {
        for (Subscriber subscriber : subcribers) {
            subscriber.update(message);
        }
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subcribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subcribers.remove(subscriber);
    }

    public LogPublisher() {
        this.subcribers = new ArrayList<>();
    }
}
