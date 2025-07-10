package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.Supplier;
//get
public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to return a random number
        Supplier<Double>randomNumber=()->Math.random();

        System.out.println(randomNumber.get()); // Random number between 0 and 1
    }
}
