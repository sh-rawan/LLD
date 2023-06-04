package E_commerce.payments;

public interface PaymentProcessor {
    boolean processPayment();

    double getPayableAmount();
}
