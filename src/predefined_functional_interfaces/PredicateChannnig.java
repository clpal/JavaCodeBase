package predefined_functional_interfaces;

import java.util.function.Predicate;

public class PredicateChannnig {
    public static void main(String[] args) {
        Predicate<String>s1=x->x.contains("L");
        Predicate<String>s2=x->x.length()>5;

        if (s1.and(s2).test("Hello")){
            System.out.printf("  satisfiled");
        }
        else {
            System.out.printf(" not satisfiled");
        }
    }
}
