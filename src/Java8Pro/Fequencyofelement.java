package Java8Pro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fequencyofelement {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(3,3,4,5,4,4,8,8,4,5,3);
      Map<Integer,Long> frequencymap= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     for (Map.Entry<Integer,Long>entry: frequencymap.entrySet()){
         {
             System.out.println(entry.getKey() + ": " + entry.getValue());

         }}
    }
}
