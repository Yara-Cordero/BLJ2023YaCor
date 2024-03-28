package VehicleRental;


import VehicleRental.Exceptions.LeaseLengthCollisionException;
import VehicleRental.Exceptions.MinorAgeException;
import VehicleRental.Vehicles.Vehicle;

import java.time.LocalDate;

public class Contract {

    private Person customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String contractTerms;

    public Contract(Person customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String contractTerms) throws MinorAgeException, LeaseLengthCollisionException {
        if(customer.getAge() < 18){
            throw new MinorAgeException("Customer is under the legal age limit.");
        }



        VehicleRentalManager vrm = new VehicleRentalManager();

        for (Contract existingContract : vrm.getContracts()){
            if(startDate.isBefore(existingContract.getEndDate()) && endDate.isAfter(existingContract.getStartDate()));{
                throw new LeaseLengthCollisionException();
            }
        }
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractTerms = contractTerms;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getContractTerms() {
        return contractTerms;
    }

    public void setContractTerms(String contractTerms) {
        this.contractTerms = contractTerms;
    }
}
