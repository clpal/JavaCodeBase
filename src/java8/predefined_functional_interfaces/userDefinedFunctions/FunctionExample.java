package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.Function;
// apply ,then ,compose
public class FunctionExample {
    public static void main(String[] args) {
        // Function to convert a string to uppercase
        Function<String,String>toUpperCase=str->str.toUpperCase();
        System.out.println(toUpperCase.apply("hello")); // "HELLO"
    }
}

