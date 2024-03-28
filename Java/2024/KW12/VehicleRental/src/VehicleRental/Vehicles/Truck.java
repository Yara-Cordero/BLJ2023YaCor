package VehicleRental.Vehicles;

import VehicleRental.Vehicles.Car;

import java.time.LocalDate;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String brand, String color, LocalDate releaseDate, String type, int weightLimit,
                 String name, String engine, String energySupply, int seatCount, int doorCount, boolean automatic, int topSpeed) {
        super(brand, color, releaseDate, type, weightLimit, name, engine, energySupply, seatCount, doorCount, automatic, topSpeed);
    }
}
