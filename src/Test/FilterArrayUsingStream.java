package Test;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class FilterArrayUsingStream {
    public static void main(String[] args) {
        int[] input = {1, 11, 32, 21, 51, 61, 54, 70, 77, 90};

        // Use Java 8 Stream API to filter the input array
        int[] output = Arrays.stream(input)
                .filter((IntPredicate) new IntFilter())
                .toArray();

        // Convert the output array to a formatted string
        String outputString = Arrays.stream(output)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Output: " + outputString);
    }
}

class IntFilter {
    private int prev = Integer.MIN_VALUE; // Initialize with a minimum value

    public boolean test(int num) {
        boolean result = num < prev;
        prev = num;
        return result;
    }
}
