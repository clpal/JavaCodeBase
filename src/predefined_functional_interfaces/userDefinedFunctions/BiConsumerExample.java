package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // BiConsumer to print two numbers
        BiConsumer<Integer, Integer> printSum = (a, b) -> System.out.println(a + b);

        printSum.accept(5, 10); // 15
    }
}
