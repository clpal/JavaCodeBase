package exceptions.customException.Unchecked;

// Custom Exception extending RuntimeException (unchecked)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
