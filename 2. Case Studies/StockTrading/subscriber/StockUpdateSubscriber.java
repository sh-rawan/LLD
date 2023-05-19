package StockTrading.subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import StockTrading.data.StockName;
import StockTrading.data.StockValue;
import StockTrading.publisher.StockPublisher;

public class StockUpdateSubscriber implements StockSubscriber {
    private final String name;
    private Map<StockName, StockValue> stockValues;
    private List<StockPublisher> publishers;

    public StockUpdateSubscriber(String name) {
        this.name = name;
        stockValues = new HashMap<>();
        publishers = new ArrayList<>();
    }

    @Override
    public void update(StockName stockName, StockValue stockValue) {
        if (!stockValues.containsKey(stockName)
                || stockValues.get(stockName).getVersionNumber() < stockValue.getVersionNumber()) {
            stockValues.put(stockName, stockValue);
            System.out.println(name + " " + stockName + " " + stockValue + ".");
        }
    }

    public StockPublisher getPublisher(String name) {
        for (StockPublisher stockPublisher : publishers) {
            if (stockPublisher.getName() == name) {
                return stockPublisher;
            }
        }
        return null;
    }
}
