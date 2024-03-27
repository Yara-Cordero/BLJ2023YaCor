package VehicleRental;

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
