package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.Predicate;
// and, test , or ,negative
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven=num->num%2==0;
        System.out.println(isEven.test(7));
        System.out.println(isEven.test(10));
    }
}
