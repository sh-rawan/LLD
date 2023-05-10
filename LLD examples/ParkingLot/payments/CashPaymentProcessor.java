package ParkingLot.payments;

public class CashPaymentProcessor implements PaymentProcessor {
    private final double amount;
    public CashPaymentProcessor(double amount) {
        this.amount = amount;
    }
    public boolean executePayment(){
        return true;
    }
    public double getAmount() {
        return amount;
    }
}
