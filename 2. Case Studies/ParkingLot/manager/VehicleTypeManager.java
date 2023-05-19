package ParkingLot.manager;

import java.util.List;

import ParkingLot.data.ParkingSpot;

public interface VehicleTypeManager {
    List<ParkingSpot> getParkingSpots();
    double getParkingFees(double durationInHours);
}
