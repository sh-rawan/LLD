package ParkingLot.data;

import java.time.LocalDateTime;

public class Vehicle {
    private final String name;
    private final VehicleType vehicleType;
    private final String number;
    private final LocalDateTime enteryTime;
    public Vehicle(String name, VehicleType vehicleType, String number, LocalDateTime enteryTime) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.number = number;
        this.enteryTime = enteryTime;
    }
    public String getName() {
        return name;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getNumber() {
        return number;
    }
    public LocalDateTime getEnteryTime() {
        return enteryTime;
    }
}
