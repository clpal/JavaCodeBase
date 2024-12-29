package exceptions.customException.Unchecked;

public class Main {
    public static void findResource(String resourceName) {
        if (resourceName == null) {
            throw new ResourceNotFoundException("Resource not found: " + resourceName);
        }
        System.out.println("Resource found: " + resourceName);
    }

    public static void main(String[] args) {
        try {
            findResource(null);
        } catch (ResourceNotFoundException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
