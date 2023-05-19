package StockTrading.publisher;

import java.util.ArrayList;
import java.util.List;

import StockTrading.data.StockName;
import StockTrading.data.StockValue;
import StockTrading.subscriber.StockSubscriber;

public class StockUpdatePublisher implements StockPublisher {
    private final String name;
    private List<StockSubscriber> subscriber;

    public StockUpdatePublisher(String name) {
        this.name = name;
        subscriber = new ArrayList<>();
    }

    @Override
    public void notifySubscriber(StockName stockName, StockValue stockValue) {
        for (StockSubscriber stockSubscriber : this.subscriber) {
            stockSubscriber.update(stockName, stockValue);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void subscribe(StockSubscriber subscriber) {
        this.subscriber.add(subscriber);
    }

    @Override
    public void unsubscribe(StockSubscriber subscriber) {
        this.subscriber.remove(subscriber);
    }

}
