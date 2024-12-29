package exceptions.customException.CheckedCustomException;


public class InvalidAgeExceptionMain {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Valid age!");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}

