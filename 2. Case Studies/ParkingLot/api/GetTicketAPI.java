package ParkingLot.api;

import ParkingLot.data.ParkingSpot;
import ParkingLot.data.Ticket;
import ParkingLot.data.Vehicle;
import ParkingLot.ticket.TicketGenerator;

public class GetTicketAPI {
    
    public Ticket getTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        return new TicketGenerator().generateTicket(vehicle, parkingSpot);
    }
}
