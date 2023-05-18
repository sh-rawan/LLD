package ObserverPattern.publisher;

import ObserverPattern.sucribers.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifyAll(int runs, int wickets, float overs);

    public int getRuns();

    public int getWickets();

    public float getOvers();
}
