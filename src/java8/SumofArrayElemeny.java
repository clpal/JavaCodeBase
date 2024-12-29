package java8;

import java.util.*;

public class SumofArrayElemeny {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2};

        List<Integer> list=new ArrayList<>();

     int ss=   list.stream().reduce(0,(a,b)->a+b);
        int i=list.stream().mapToInt(Integer::intValue).sum();
        System.out.printf(""+ss);
 Set <Integer>set=new HashSet<>();
     // int aa=  Arrays.stream(arr).sum();
    Arrays.stream(arr).filter(x->!set.add(x)).forEach(System.out::println);




    }
}
