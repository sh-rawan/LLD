package StockTrading.subscriber;

import StockTrading.data.StockName;
import StockTrading.data.StockValue;

public interface StockSubscriber {
    void update(StockName stockName, StockValue stockValue);
}
