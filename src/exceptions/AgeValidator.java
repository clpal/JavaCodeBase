package exceptions;
public class AgeValidator {

    public void validateAge(int age) {
        if (age < 0 || age > 120) {
            // Throw the custom unchecked exception with a message
            throw new InvalidAgeException("Invalid age: Age must be between 0 and 120");
        }

        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(-5);  // Will cause an exception
        } catch (InvalidAgeException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
