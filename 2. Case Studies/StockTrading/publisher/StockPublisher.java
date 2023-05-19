package StockTrading.publisher;

import StockTrading.data.StockName;
import StockTrading.data.StockValue;
import StockTrading.subscriber.StockSubscriber;

public interface StockPublisher {
    void subscribe(StockSubscriber subscriber);

    void unsubscribe(StockSubscriber subscriber);

    void notifySubscriber(StockName stockName, StockValue stockValue);

    String getName();
}
