package E_commerce.notifiers;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifyAll(String message);
}
