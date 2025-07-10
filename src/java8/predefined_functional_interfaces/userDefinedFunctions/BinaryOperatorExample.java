package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // BinaryOperator to add two numbers
        BinaryOperator<Integer>add=(a,b)->a+b;
        System.out.println(add.apply(10,20));// 30
    }
}
