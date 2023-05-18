package ObserverPattern.publisher;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.sucribers.Subscriber;

public class SonyCricketScoreBoardPublisher implements Publisher {
    private int runs;
    private int wickets;
    private float overs;

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOvers() {
        return overs;
    }

    private List<Subscriber> subscribers;

    public SonyCricketScoreBoardPublisher() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifyAll(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        for (Subscriber sucriber : subscribers) {
            sucriber.update(this);
        }
    }
}
