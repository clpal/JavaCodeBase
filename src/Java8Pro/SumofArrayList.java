package Java8Pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumofArrayList {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
           List list1= new ArrayList<Integer>();
           list1.add(1);
           list1.add(2);
           list1.add(3);
           list1.add(4);
        Stream.of(list);
        list.stream().collect(Collectors.toList());
        System.out.println(""+list1);
        System.out.println(""+list);
        int[] A = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(A).sum();
        int sum1 =  IntStream.of(A).sum();
        // lambda
        int sum2 = Arrays.stream(A).reduce((x, y) -> x + y).getAsInt();
        // method reference
        int sum3 = Arrays.stream(A).reduce(Integer::sum).getAsInt();
        // map
   //  int s=   list.stream().mapToInt(Integer::intValue).sum();
  //List<String>ll=  list.stream().map(x->x+"chhote").collect(Collectors.toList());

     //   System.out.println(s);
/*        List<String> list = Arrays.asList("geeks", "gfg", "g",
                "e", "e", "k", "s");*/
     //  List<String>strings= list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
     //   System.out.println(strings);
      //  List<Integer>stringslength= list.stream().map(c->c.length()).collect(Collectors.toList());
        //stringslength.forEach(System.out::println);
       // List<Integer>ss=Arrays.asList(11,55,31,41,14,56,91,71,33);
       // ss.stream().map(x->x+"").filter(x->x.endsWith("1")).forEach(System.out::println);
       //List<String>s= ss.stream().map(c->c+"").collect(Collectors.toList());
    // List<Integer>integers=  list.stream().map(x->x*3).collect(Collectors.toList());
    // ss.forEach(System.out::println);
    }
}
