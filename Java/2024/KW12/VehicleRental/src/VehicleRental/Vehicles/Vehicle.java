package VehicleRental.Vehicles;

import java.time.LocalDate;

public class Vehicle {

    private String name;
    private String brand;
    private String color;
    private LocalDate releaseDate;
    private String type;
    private int weightLimit;

    public Vehicle() {
    }

    public Vehicle(String name, String brand, String color, LocalDate releaseDate, String type, int weightLimit) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.releaseDate = releaseDate;
        this.type = type;
        this.weightLimit = weightLimit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
