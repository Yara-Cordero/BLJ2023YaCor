package VehicleRental;

import java.time.LocalDate;

public class Starter {

    public static void main(String[] args) {

        VehicleRentalManager vrm = new VehicleRentalManager();

        vrm.addVehicle(new LuxuryCar("Mercedes-Benz","Silver",LocalDate.of(2023, 1, 1),
                "Sedan",2200,"S-Class","V8","Gasoline",5,4,true,155
        ));

        LuxuryCar mercedesSClass = new LuxuryCar("Mercedes-Benz","Silver",LocalDate.of(2023, 1, 1),
                "Sedan",2200,"S-Class","V8","Gasoline",5,4,true,155
        );

        NormalCar fiat500 = new NormalCar("Fiat", "Red", LocalDate.of(2022, 8, 1),
                "Hatchback", 1200, "500", "Inline-4", "Gasoline", 4, 2, true, 110
        );

        Camper vwCalifornia = new Camper("Volkswagen", "White", LocalDate.of(2023, 1, 1), "Camper Van", 2500, "California",
                "V6", "Diesel", 4, 2, true, 120, true, 2, true, true, true
        );

        Trailer hochlader = new Trailer("Böckmann", "Red", LocalDate.of(2022, 1, 1),
                "Hochlader", 1500, "für Heissluftballon"
        );

        Trailer bootanhaenger = new Trailer("Böckmann", "Blue", LocalDate.of(2022, 1, 1),
                "Bootanhaenger", 2000, "für Boot"
        );

        Trailer tieflader = new Trailer("Böckmann", "Yellow", LocalDate.of(2022, 1, 1),
                "Tieflader", 1800, "für Velos"
        );



    }
}
