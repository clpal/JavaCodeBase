package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator to square a number
        UnaryOperator<Integer> square = num -> num * num;

        System.out.println(square.apply(5)); // 25
    }

}
