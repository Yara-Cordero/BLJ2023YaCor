package VehicleRental;

import java.time.LocalDate;

public class Camper extends Car{
    private boolean bed;
    private int bedCount;
    private boolean kitchen;
    private boolean bathroom;
    private boolean shower;

    public Camper() {
    }

    public Camper(String brand, String color, LocalDate releaseDate, String type, int weightLimit, String name, String engine, String energySupply, int seatCount,
                  int doorCount, boolean automatic, int topSpeed, boolean bed, int bedCount, boolean kitchen, boolean bathroom, boolean shower) {
        super(brand, color, releaseDate, type, weightLimit, name, engine, energySupply, seatCount, doorCount, automatic, topSpeed);
        this.bed = bed;
        if (bed){
            this.bedCount = bedCount;
        }
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.shower = shower;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isBathroom() {
        return bathroom;
    }

    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }

    public boolean isShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }
}
