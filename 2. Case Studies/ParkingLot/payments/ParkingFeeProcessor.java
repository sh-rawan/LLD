package ParkingLot.payments;

import ParkingLot.data.Ticket;
import ParkingLot.manager.VehicleTypeManagerFactory;

public class ParkingFeeProcessor {
    
    public double getParkingFees(Ticket ticket){

        double duration = 0;
        // figure out the duration of parking
        return VehicleTypeManagerFactory.getVehicleTypeManager(ticket.getVehicle().getVehicleType()).getParkingFees(duration);
    }

    public boolean processParkingFees(Ticket ticket, PaymentProcessor paymentProcessor){
        if(getParkingFees(ticket) != paymentProcessor.getAmount())
            throw new RuntimeException("");
        return paymentProcessor.executePayment();
    }
}
