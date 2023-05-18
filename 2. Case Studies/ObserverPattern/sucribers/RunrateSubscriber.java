package ObserverPattern.sucribers;

import java.util.List;

import ObserverPattern.publisher.Publisher;

public class RunrateSubscriber implements Subscriber {
    private int runs;
    private float overs;
    private List<Publisher> publishers;

    public RunrateSubscriber(List<Publisher> publishers) {
        this.publishers = publishers;
        for (Publisher publisher : this.publishers) {
            publisher.subscribe(this);
        }
    }

    public List<Publisher> getPublisher() {
        return publishers;
    }

    public void update(Publisher publisher) {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        System.out.println("RunRateSubscriber are : " + this.runs + ", " + this.overs + ".");
    }

    public int getRuns() {
        return runs;
    }

    public float getOvers() {
        return overs;
    }
}
