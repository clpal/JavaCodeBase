package java8.mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Startwith1 {
    public static void main(String[] args) {
       Stream<Integer> list=Stream.of(1,12,31,41,166,51,14,44,3,88,46,7);
       list.map(String::valueOf).filter(x->x.startsWith("1")).forEach(System.out::println);

        //System.out.printf(""+list);
       List<Integer>list1= Arrays.asList(1,12,31,41,166,51,14,44,3,88,46,7);
      List<String>strList= list1.stream().map(x->x+"").filter(x->!x.startsWith("1")).collect(Collectors.toList());
        strList.forEach(System.out::println);
    }
}
