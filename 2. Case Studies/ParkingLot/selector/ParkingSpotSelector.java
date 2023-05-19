package ParkingLot.selector;

import java.util.List;

import ParkingLot.data.ParkingSpot;

public interface ParkingSpotSelector {
    public ParkingSpot selectSpot(List<ParkingSpot> parkingSpot);
}
