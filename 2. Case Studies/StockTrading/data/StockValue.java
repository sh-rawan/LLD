package StockTrading.data;

public class StockValue {
    private final int versionNumber;
    private final Currency currency;
    private final double value;

    public StockValue(int versionNumber, Currency currency, double value) {
        this.versionNumber = versionNumber;
        this.currency = currency;
        this.value = value;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    @Override
    public String toString() {
        return currency.toString() + " " + this.value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }
}
