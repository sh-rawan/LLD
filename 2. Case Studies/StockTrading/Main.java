package StockTrading;

import StockTrading.data.Currency;
import StockTrading.data.StockName;
import StockTrading.data.StockValue;
import StockTrading.publisher.StockPublisher;
import StockTrading.publisher.StockUpdatePublisher;
import StockTrading.subscriber.StockSubscriber;
import StockTrading.subscriber.StockUpdateSubscriber;

public class Main {
    public static void main(String[] args) {
        StockPublisher bsePublisher = new StockUpdatePublisher("BSE");
        StockPublisher nsePublisher = new StockUpdatePublisher("NSE");

        StockSubscriber zerodha = new StockUpdateSubscriber("Zerodha");
        StockSubscriber sbi = new StockUpdateSubscriber("SBI");
        StockSubscriber upTox = new StockUpdateSubscriber("UpTox");

        nsePublisher.subscribe(zerodha);
        nsePublisher.subscribe(sbi);
        bsePublisher.subscribe(zerodha);
        bsePublisher.subscribe(sbi);
        bsePublisher.subscribe(upTox);

        nsePublisher.notifySubscriber(StockName.AMAZON, new StockValue(3, Currency.INR, 100));
        nsePublisher.notifySubscriber(StockName.AMAZON, new StockValue(5, Currency.INR, 200));
        bsePublisher.notifySubscriber(StockName.AMAZON, new StockValue(4, Currency.INR, 300));
    }
}
