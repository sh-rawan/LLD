package ParkingLot.ticket;

import ParkingLot.data.ParkingSpot;
import ParkingLot.data.Ticket;
import ParkingLot.data.Vehicle;

public class TicketGenerator {
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        String ticketNum = getUniqueTicketNum();
        // logic to check if isFree & then park & persist changes
        return new Ticket(ticketNum, vehicle, parkingSpot);
    }

    private String getUniqueTicketNum(){
        return "";
    }
}
