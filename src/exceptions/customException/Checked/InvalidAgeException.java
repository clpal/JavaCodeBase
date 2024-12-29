package exceptions.customException.Checked;

// Custom Exception extending Exception (checked)
public class InvalidAgeException extends Exception {
    // Default constructor
    public InvalidAgeException() {
        super("Invalid age provided");
    }

    // Constructor with custom message
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor with cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
