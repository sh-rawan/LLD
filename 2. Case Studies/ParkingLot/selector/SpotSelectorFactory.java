package ParkingLot.selector;

import ParkingLot.data.EnteryPoint;

public class SpotSelectorFactory {
    private SpotSelectorFactory(){}

    public static ParkingSpotSelector getNearestParkingSpotSelector(EnteryPoint enteryPoint){
        return new NearestSelector(enteryPoint);
    }

    public static ParkingSpotSelector getRandomSelector(){
        return new RandomSelector();
    }
}
