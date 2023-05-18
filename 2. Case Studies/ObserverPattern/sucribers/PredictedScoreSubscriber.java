package ObserverPattern.sucribers;

import java.util.List;

import ObserverPattern.publisher.Publisher;

public class PredictedScoreSubscriber implements Subscriber {
    private int runs;
    private int wickets;
    private float overs;
    private List<Publisher> publishers;

    public PredictedScoreSubscriber(List<Publisher> publishers) {
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
        this.wickets = publisher.getWickets();
        this.overs = publisher.getOvers();
        System.out
                .println("PredictedScoreSubscriber are : " + this.runs + ", " + this.wickets + ", " + this.overs + ".");
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOvers() {
        return overs;
    }
}
