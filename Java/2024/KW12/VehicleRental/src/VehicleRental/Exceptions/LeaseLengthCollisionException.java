package VehicleRental.Exceptions;

public class LeaseLengthCollisionException extends Exception {
    public LeaseLengthCollisionException() {
        super("Lease length collision detected.");
    }

    public LeaseLengthCollisionException(String message) {
        super(message);
    }
}
