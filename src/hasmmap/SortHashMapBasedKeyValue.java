package hasmmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapBasedKeyValue {
    public static void main(String[] args) {
//

        // https://www.benchresources.net/sorting-hashmap-by-keys-and-values-using-stream-in-java-8/
            Map<String ,Integer> map= new HashMap<>();
            map.put("Jayant", 80);
            map.put("Abhishek", 90);
            map.put("Anushka", 80);
            map.put("Amit", 75);
            map.put("Danish", 40);
            //  Map<String,Integer>map1= map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

            //  Map<String,Integer>map1= map.entrySet().stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

           //  Map<String,Integer>map1= map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1, LinkedHashMap::new));

           map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(c1,c2)->c1,LinkedHashMap::new)).forEach((x,y)->System.out.println(x+""+y));
         /*   for (Map.Entry<String,Integer>me:map1.entrySet()) {
                System.out.println(me.getKey() + " "+me.getValue());

        }*/

      //  map1.forEach((k,v)->System.out.println(k +" "+v));
    }
}
