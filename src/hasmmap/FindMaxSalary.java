package hasmmap;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxSalary
{
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("D",700);
        map.put("A",100);
        map.put("C",2000);
        map.put("B",500);

             map.entrySet().stream().sorted(Collections.reverseOrder()).findFirst().get().getValue();
           int ss=  map.entrySet().stream().sorted().findFirst().get().getValue(); // min
        map.entrySet().stream().sorted(Collections.reverseOrder()).findFirst().get(); //max
       int aa=map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
       int bb=map.entrySet().stream().max((a,b)->a.getValue().compareTo(b.getValue())).get().getValue();
       int b=   map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).findFirst().get().getValue();
int z= map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(c,c1)->c,LinkedHashMap::new));
        //map1.forEach((k,v)->System.out.println(k+"-"+v));
        System.out.printf(""+aa +" "+bb + b);
    }
}
