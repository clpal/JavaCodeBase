package java8.grouppingBy;

import java.util.stream.Collectors;


import java.util.*;
        import java.util.stream.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "aaajjjjjiiiicccca";

        // Step 1: Convert the string to an IntStream of character indices
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Step 2: Print the frequency map
        frequencyMap.forEach((key, value) -> {
            System.out.println("Character: " + key + ", Frequency: " + value);
        });
    }
}
