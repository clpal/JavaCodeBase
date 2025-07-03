package Java8Pro.reduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumofArrayListElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,3,8);
        // befor java 8
    /*    int sum=0;
        for (Integer value:list) {
            sum=sum+value;
        }
        System.out.printf(""+sum);*/

  /*   int sum=   list.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);*/
      // Integer  sum= list.stream().reduce(0,(a, b)->a+b);
       Integer  sum= list.stream().reduce(1,(a, b)->a+b);
       // System.out.println(sum);

        Integer  sum1= list.stream().reduce(Integer::sum).get();
        Optional<Integer>  sum2= list.stream().reduce(Integer::sum);
        System.out.println(sum2.get());

        // sum of subsequents element
        Optional<Integer> f=list.stream().reduce((c,d)->c+d);
        System.out.println(f.get());
    }
}
