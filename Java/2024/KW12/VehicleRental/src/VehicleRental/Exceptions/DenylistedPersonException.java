package VehicleRental.Exceptions;

public class DenylistedPersonException extends Exception {
    public DenylistedPersonException() {
        super("Denied Person detected.");
    }

    public DenylistedPersonException(String message) {
        super(message);
    }
}
