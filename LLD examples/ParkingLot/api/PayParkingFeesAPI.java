package ParkingLot.api;

import java.util.Map;

import ParkingLot.data.Ticket;
import ParkingLot.payments.CardDetails;
import ParkingLot.payments.ParkingFeeProcessor;
import ParkingLot.payments.PaymentMode;
import ParkingLot.payments.PaymentProcessor;
import ParkingLot.payments.PaymentProcessorFactory;

public class PayParkingFeesAPI {
    public boolean PayParkingFees(Ticket ticket, PaymentMode paymentMode, Map<String, String> paymentDetails){
        PaymentProcessor paymentProcessor = null;
        if(paymentMode.equals(PaymentMode.CARD)){
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            CardDetails cardDetails = null;
            // logic to create above object
            paymentProcessor = PaymentProcessorFactory.getCardBasedPaymentProcessor(amount, cardDetails);
        } else if(paymentMode.equals(PaymentMode.CASH)){
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            paymentProcessor = PaymentProcessorFactory.getCashBasedPaymentProcessor(amount);
        } else {
            throw new IllegalArgumentException();
        }
        return new ParkingFeeProcessor().processParkingFees(ticket, paymentProcessor);
    }
}
