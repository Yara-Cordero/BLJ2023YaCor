package VehicleRental;

import java.time.LocalDate;

public class Trailer extends Vehicle{

    private String usageType;

    public Trailer(String brand, String color, LocalDate releaseDate, String type, int weightLimit, String usageType) {
        super(brand, color, releaseDate, type, weightLimit);
        this.usageType = usageType;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }
}
