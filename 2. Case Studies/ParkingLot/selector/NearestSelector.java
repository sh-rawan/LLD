package ParkingLot.selector;

import java.util.List;

import ParkingLot.data.EnteryPoint;
import ParkingLot.data.ParkingSpot;

public class NearestSelector implements ParkingSpotSelector{

    private final EnteryPoint enteryPoint;

    public NearestSelector(EnteryPoint enteryPoint){
        this.enteryPoint = enteryPoint;
    }

    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> parkingSpot) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
