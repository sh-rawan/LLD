package ObserverPattern;

import java.util.Arrays;
import java.util.List;

import ObserverPattern.publisher.SonyCricketScoreBoardPublisher;
import ObserverPattern.publisher.Publisher;
import ObserverPattern.sucribers.PredictedScoreSubscriber;
import ObserverPattern.sucribers.RunrateSubscriber;
import ObserverPattern.sucribers.Subscriber;
import ObserverPattern.sucribers.TopDiscussions;

public class PubSubTester {
    static void connect(Publisher publisher, List<Subscriber> subscribers) {
        for (Subscriber subscriber : subscribers) {
            publisher.subscribe(subscriber);
        }
    }

    public static void main(String[] args) {
        SonyCricketScoreBoardPublisher cricketScoreBoardPublisher = new SonyCricketScoreBoardPublisher();
        RunrateSubscriber runrateSubscriber = new RunrateSubscriber(Arrays.asList(cricketScoreBoardPublisher));
        TopDiscussions topDiscussions = new TopDiscussions(Arrays.asList(cricketScoreBoardPublisher));
        PredictedScoreSubscriber predictedScoreSubscriber = new PredictedScoreSubscriber(
                Arrays.asList(cricketScoreBoardPublisher));

        // connect(cricketScoreBoardPublisher, Arrays.asList(runrateSubscriber,
        // topDiscussions, predictedScoreSubscriber));
        cricketScoreBoardPublisher.notifyAll(23, 21, 23);
        runrateSubscriber.getPublisher().get(0).unsubscribe(runrateSubscriber);
        cricketScoreBoardPublisher.notifyAll(2, 1, 3);
    }
}
