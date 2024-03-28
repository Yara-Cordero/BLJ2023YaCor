package VehicleRental;

import VehicleRental.Exceptions.DenylistedPersonException;
import VehicleRental.Exceptions.LeaseLengthCollisionException;
import VehicleRental.Exceptions.MinorAgeException;
import VehicleRental.Vehicles.*;

import java.time.LocalDate;

public class Starter {

    public static void main(String[] args) {

        VehicleRentalManager vrm = new VehicleRentalManager();
        initializeAll(vrm);

        try {
            Contract c1 = new Contract(vrm.getPerson("Anik", "Stadelmann"), vrm.getVehicle("Boeckmann", ""), LocalDate.now(), LocalDate.now().plusDays(14), "valid until: see end date.");
            vrm.addContract(c1);
        } catch (LeaseLengthCollisionException | MinorAgeException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void initializeAll(VehicleRentalManager vrm){

        Person p1 = new Person("Anik", "Stadelmann", LocalDate.of(2006,9,19), "0764534368", "blabla@adasd" );
        vrm.addCustomer(p1);

        LuxuryCar mercedesSClass = new LuxuryCar("Mercedes-Benz","Silver", LocalDate.of(2023, 1, 1),
                "Sedan",2200,"S-Class","V8","Gasoline",5,4,true,155);
        vrm.addVehicle(mercedesSClass);

        LuxuryCar bmwZ4Cabriolet = new LuxuryCar("BMW", "Red", LocalDate.of(2023, 1, 1), "Z4 cabriolet", 1800,
                "Z4 Cabriolet", "V6", "Petrol", 2, 2, true, 200);
        vrm.addVehicle(bmwZ4Cabriolet);

        LuxuryCar mazdaMX5Cabriolet = new LuxuryCar("Mazda", "White", LocalDate.of(2023, 1, 1), "MX5 cabriolet", 1600,
                "MX5 Cabriolet", "Inline-4", "Petrol", 2, 2, true, 190);
        vrm.addVehicle(mazdaMX5Cabriolet);

        LuxuryCar bmw18 = new LuxuryCar("BMW", "Blue", LocalDate.of(2023, 1, 1), "18", 2000,
                "i8", "V8", "Petrol", 4, 4, true, 170);
        vrm.addVehicle(bmw18);

        NormalCar fiat500 = new NormalCar("Fiat", "Red", LocalDate.of(2022, 8, 1),
                "Hatchback", 1200, "500", "Inline-4", "Gasoline", 4, 2, true, 110);
        vrm.addVehicle(fiat500);

        NormalCar opelCorsa = new NormalCar("Opel", "Blue", LocalDate.of(2023, 1, 1), "Corsa", 1200,
                "Corsa", "Inline-4", "Petrol", 4, 4, true, 160);
        vrm.addVehicle(opelCorsa);

        NormalCar hyundaiI10 = new NormalCar("Hyundai", "White", LocalDate.of(2023, 1, 1), "I10", 1000,
                "I10", "Inline-3", "Petrol", 4, 4, true, 140);
        vrm.addVehicle(hyundaiI10);

        NormalCar suzukiSwift = new NormalCar("Suzuki", "Black", LocalDate.of(2023, 1, 1), "Swift", 1150,
                "Swift", "Inline-4", "Petrol", 4, 4, true, 155);
        vrm.addVehicle(suzukiSwift);

        Truck mercedesVita = new Truck("Mercedes", "White", LocalDate.of(2023, 1, 1), "Vita", 3000,
                "Vita", "V8", "Diesel", 3, 2, true, 120);
        vrm.addVehicle(mercedesVita);

        Truck vwCrafter = new Truck("Volkswagen", "Blue", LocalDate.of(2023, 1, 1), "Crafter", 3500,
                "Crafter", "V6", "Diesel", 3, 2, true, 130);
        vrm.addVehicle(vwCrafter);

        Truck ivecoDaily = new Truck("Iveco", "Red", LocalDate.of(2023, 1, 1), "Daily", 4000,
                "Daily", "V8", "Diesel", 3, 2, true, 125);
        vrm.addVehicle(ivecoDaily);

        Truck opelCicoroE = new Truck("Opel", "Green", LocalDate.of(2023, 1, 1), "Cicoro E", 2500,
                "Cicoro E", "Electric", "Electric", 3, 2, true, 110);
        vrm.addVehicle(opelCicoroE);

        Truck vwECrafter = new Truck("Volkswagen", "Yellow", LocalDate.of(2023, 1, 1), "e-Crafter", 3000,
                "e-Crafter", "Electric", "Electric", 3, 2, true, 115);
        vrm.addVehicle(vwECrafter);

        Camper vwCalifornia = new Camper("Volkswagen", "White", LocalDate.of(2023, 1, 1), "Camper Van", 2500
                , "California", "V6", "Diesel", 4, 2, true, 120, true, 2, true, true, true);
        vrm.addVehicle(vwCalifornia);

        Camper hymermobil = new Camper("Hymer", "White", LocalDate.of(2023, 1, 1), "Hymermobil", 3500,
                "Hymermobil", "V6", "Diesel", 4, 2, true, 120,
                true, 2, true, true, true);
        vrm.addVehicle(hymermobil);

        Trailer hochlader = new Trailer("Hochlader","Boeckmann", "Red", LocalDate.of(2022, 1, 1), "für Heissluftballon"
                , 1500
        );
        vrm.addVehicle(hochlader);

        Trailer bootanhaenger = new Trailer("Bootanhaenger","Boeckmann", "Blue", LocalDate.of(2022, 1, 1) ,"für Boot", 2000
        );
        vrm.addVehicle(bootanhaenger);

        Trailer tieflader = new Trailer("Tieflader","Boeckmann", "Yellow", LocalDate.of(2022, 1, 1),"für Velos"
                , 1800
        );
        vrm.addVehicle(tieflader);


    }
}
