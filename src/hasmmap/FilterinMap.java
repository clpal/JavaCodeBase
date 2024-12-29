package hasmmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterinMap {
    public static void main(String[] args) {
        Map<String ,Integer> map= new HashMap<>();
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
/*        map.entrySet().stream().filter(c->c.getValue()>50).sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(c, c1)->c, LinkedHashMap::new)).
                forEach((x,y)->System.out.println(x+" "+y));*/

   Map<String
           ,Integer>map1=map.entrySet().stream().filter(c->c.getValue()>50).sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.printf(""+map1);
    }
}
