package ParkingLot.api;

import ParkingLot.data.Ticket;
import ParkingLot.payments.ParkingFeeProcessor;

public class GetParkingFeeAPI {
    public double getParkingFees(Ticket ticket){
        return new ParkingFeeProcessor().getParkingFees(ticket);
    }
}
