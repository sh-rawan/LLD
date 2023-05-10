package ParkingLot.api;

import ParkingLot.data.EnteryPoint;
import ParkingLot.data.ParkingSpot;
import ParkingLot.data.SpotSelection;
import ParkingLot.data.VehicleType;
import ParkingLot.finder.ParkingSpotFinder;
import ParkingLot.manager.VehicleTypeManager;
import ParkingLot.manager.VehicleTypeManagerFactory;
import ParkingLot.selector.ParkingSpotSelector;
import ParkingLot.selector.SpotSelectorFactory;

public class FindParkingSpotAPI {
    public ParkingSpot findParkingSpot(EnteryPoint enteryPoint, VehicleType vehicleType, SpotSelection spotSelection){
        VehicleTypeManager vehicleTypeManager = VehicleTypeManagerFactory.getVehicleTypeManager(vehicleType);
        ParkingSpotSelector parkingSpotSelector;
        if(spotSelection.equals(SpotSelection.RANDOM))
            parkingSpotSelector = SpotSelectorFactory.getRandomSelector();
        else if(spotSelection.equals(SpotSelection.NEAREST))
            parkingSpotSelector = SpotSelectorFactory.getNearestParkingSpotSelector(enteryPoint);
        else
            throw new RuntimeException("");

        return new ParkingSpotFinder(vehicleTypeManager, parkingSpotSelector).findParkingSpot();
    }
}
