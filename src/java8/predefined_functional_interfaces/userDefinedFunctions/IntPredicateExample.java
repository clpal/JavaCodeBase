package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {
        // IntPredicate to check if a number is positive
        IntPredicate isPositive = num -> num > 0;

        System.out.println(isPositive.test(5));  // true
        System.out.println(isPositive.test(-5)); // false
    }
}
