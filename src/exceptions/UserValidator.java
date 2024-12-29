package exceptions;

public class UserValidator {
    public void validateUser(String username) throws InvalidUserException {
        if (username == null || username.isEmpty()) {
            // Throw the custom exception with a message
            throw new InvalidUserException("Invalid user: Username cannot be null or empty");
        }

        // Additional validation logic
        System.out.println("User is valid: " + username);
    }

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        try {
            validator.validateUser("");  // Will cause an exception
        } catch (InvalidUserException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
