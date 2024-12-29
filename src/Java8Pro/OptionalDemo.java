package Java8Pro;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String email="chhote";
        // empty optional
        Optional<String>empty=Optional.empty();
        System.out.println(empty);
        Optional<String>stringOptional=Optional.of(email);
        System.out.println(stringOptional);
         Optional<String> nullableOptional=Optional.ofNullable(email);
        System.out.println(nullableOptional);
    }
}
