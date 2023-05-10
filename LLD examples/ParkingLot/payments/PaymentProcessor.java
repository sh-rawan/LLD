package ParkingLot.payments;

public interface PaymentProcessor {
    boolean executePayment();
    double getAmount();
}
