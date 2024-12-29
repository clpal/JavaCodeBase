package hasmmap;

import java.util.*;

public class SortmapKeyArray {


    public static void main(String[] args) {
         Map<String, Integer> map = new HashMap<>();
        // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        List<String>sortedlist=new ArrayList<>(map.keySet());
        Collections.sort(sortedlist);
        for (String x:sortedlist)
            System.out.println("Key = " + x
                    + ", Value = " + map.get(x));



    }
}
