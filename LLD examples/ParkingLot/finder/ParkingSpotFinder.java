package ParkingLot.finder;

import java.util.List;

import ParkingLot.data.ParkingSpot;
import ParkingLot.manager.VehicleTypeManager;
import ParkingLot.selector.ParkingSpotSelector;

public class ParkingSpotFinder {
    
    private final VehicleTypeManager vehicleTypeManager;
    private final ParkingSpotSelector parkingSpotSelector;

    public ParkingSpotFinder(VehicleTypeManager vehicleTypeManager, ParkingSpotSelector parkingSpotSelector){
        this.vehicleTypeManager=vehicleTypeManager;
        this.parkingSpotSelector=parkingSpotSelector;
    }

    public ParkingSpot findParkingSpot() {
        List<ParkingSpot> parkingSpots = this.vehicleTypeManager.getParkingSpots();
        return this.parkingSpotSelector.selectSpot(parkingSpots);
    }

}
