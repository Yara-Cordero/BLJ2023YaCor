package VehicleRental.Exceptions;

public class MinorAgeException extends Exception{
    public MinorAgeException(){
        super("Age is under legal limit.");
    }

    public MinorAgeException(String message){
        super(message);
    }
}
