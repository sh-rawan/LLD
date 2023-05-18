package ObserverPattern.sucribers;

import ObserverPattern.publisher.Publisher;

public interface Subscriber {
    void update(Publisher publisher);
}
