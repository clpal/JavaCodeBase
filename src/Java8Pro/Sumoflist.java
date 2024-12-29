package Java8Pro;

import java.util.Arrays;
import java.util.List;

public class Sumoflist {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     int sum=  list.stream().mapToInt(x->x.intValue()).sum();
      int sum1=  list.stream().mapToInt(Integer::new).sum();
        System.out.println(sum);
        System.out.println(sum1);
    }



}
