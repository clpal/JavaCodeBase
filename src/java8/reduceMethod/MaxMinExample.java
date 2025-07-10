package Java8Pro.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       Optional<Integer> large= numbers.stream().reduce((a, b)->a>b?a:b);
       System.out.println(large.get());

       List<Integer> list= Arrays.asList(1,2,3,99,2,6);
       Optional<Integer>min=list.stream().reduce((a,b)->a<b?a:b);
       System.out.println(min.get());
    }
}
