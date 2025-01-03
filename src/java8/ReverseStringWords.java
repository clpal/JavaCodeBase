package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringWords {
    public static void main(String[] args) {
        String str="abc xyz";
        String input = "Hello World from Java";
       String result= Arrays.stream(input.split(" ")).map(word-> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
   System.out.println(result);
    }

}
