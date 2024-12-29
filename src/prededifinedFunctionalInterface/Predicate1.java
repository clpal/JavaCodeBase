package prededifinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer>predicate=i->i>18;
        if (predicate.test(12)){
            System.out.printf("age is greator than 18");
        }
        else {
            System.out.printf("age is less than 18");
        }
    }
}
