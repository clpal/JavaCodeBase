package Java8Pro.reduceMethod;

import java.util.Arrays;
import java.util.List;

public class StringConcatenateExample {
    // it is like sum of arrary elements
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", " ", "World", "!");

        // Using reduce() to concatenate the strings
        String result = words.stream()
                .reduce("", (a, b) -> a + b);  // Accumulator function: concatenate a and b

        System.out.println(result);  // Output: Hello World!

    }
}
