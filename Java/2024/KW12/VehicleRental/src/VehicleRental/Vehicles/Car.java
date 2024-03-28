package VehicleRental.Vehicles;

import java.time.LocalDate;

public class Car extends Vehicle {
    private String engine;
    private String energySupply;
    private int seatCount;
    private int doorCount;
    private boolean automatic;
    private int topSpeed;

    public Car() {
    }

    public Car(String brand, String color, LocalDate releaseDate, String type, int weightLimit,
               String name, String engine, String energySupply, int seatCount, int doorCount, boolean automatic, int topSpeed) {
        super(name, brand, color, releaseDate, type, weightLimit);
        this.engine = engine;
        this.energySupply = energySupply;
        this.seatCount = seatCount;
        this.doorCount = doorCount;
        this.automatic = automatic;
        this.topSpeed = topSpeed;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEnergySupply() {
        return energySupply;
    }

    public void setEnergySupply(String energySupply) {
        this.energySupply = energySupply;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
