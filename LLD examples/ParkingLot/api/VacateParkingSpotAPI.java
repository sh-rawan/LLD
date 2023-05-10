package ParkingLot.api;

import ParkingLot.data.ParkingSpot;
import ParkingLot.vacator.ParkingSpotVacator;

public class VacateParkingSpotAPI {
    public void vacateParkingSpot(ParkingSpot parkingSpot){
        new ParkingSpotVacator().vacateParkingSpot(parkingSpot);
    }
}
