package LoggerSystem.publisher;

import LoggerSystem.subcriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notify(String message);
}
