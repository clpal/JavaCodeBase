package Java8Pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapjava {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2);
        List <Integer>l1= Arrays.asList(3,4);
        List <Integer>l2= Arrays.asList(5,6);
        List <Integer>l3= Arrays.asList(7,8);
     List< List<Integer>>newlist=  Arrays.asList(l,l1,l2,l3);
    int a= newlist.stream().flatMap(x->x.stream()).mapToInt(Integer::intValue).sum();
        System.out.printf(""+a);

    }
}
