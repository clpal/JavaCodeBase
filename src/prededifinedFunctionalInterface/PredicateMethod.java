package prededifinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateMethod {
    public static void main(String[] args) {
        predicatefunctions(15,age->age>18);
    }
   static void predicatefunctions(Integer num, Predicate<Integer>predicate){
        if (predicate.test(num)){
            System.out.printf("eligible for voting");
        }
        else {
            System.out.printf("eligible for not voting");
        }

    }
}
