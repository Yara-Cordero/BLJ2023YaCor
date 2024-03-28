package VehicleRental;

import VehicleRental.Exceptions.DenylistedPersonException;
import VehicleRental.Exceptions.LeaseLengthCollisionException;
import VehicleRental.Exceptions.MinorAgeException;
import VehicleRental.Vehicles.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalManager {
    private List<Person> customerList;
    private List<Person> denyList;
    private List<Vehicle> vehicles;
    private List<Contract> contracts;

    public VehicleRentalManager() {
        this.customerList = new ArrayList<>();
        this.denyList = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.contracts = new ArrayList<>();
    }

    public void validateDenyList(Person person) throws DenylistedPersonException{
        for (Person deniedPerson : denyList){
            if (person.equals(deniedPerson)){
                throw new DenylistedPersonException("This person is on the denied List");
            }
        }
    }

    public void rentVehicle(Person person, Vehicle vehicle){
        try {
            validateDenyList(person);
            Contract contract = new Contract(person, vehicle, LocalDate.now(), LocalDate.now().plusDays(7), "Rental Contract");

        }catch (DenylistedPersonException e){
            System.out.println(e.getMessage());
        } catch (MinorAgeException | LeaseLengthCollisionException e) {
            throw new RuntimeException(e);
        }
    }

    public Person getPerson(String firstName, String lastName) {
        for (Person person : customerList) {
            if (person.getFirstname().equals(firstName) && person.getLastname().equals(lastName)) {
                return person;
            }
        }
        return null;
    }

    public Vehicle getVehicle(String brand, String name){
        for (Vehicle vehicle : vehicles){
            if (vehicle.getBrand().equals(brand) && vehicle.getName().equals(name)){
                return vehicle;
            }
        }
        return null;
    }


    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void addPersonToDenyList(Person person){
        denyList.add(person);
    }

    public void addCustomer(Person person){
        customerList.add(person);
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public List<Person> getCustomerList() {
        return customerList;
    }

    public List<Person> getDenyList() {
        return denyList;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Contract> getContracts() {
        return contracts;
    }


}
