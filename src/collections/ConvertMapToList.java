package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {
    public static void main(String[] args) {
      /*  Map map=new HashMap<>();
        List list=new ArrayList(map.entrySet());
        List list1=new ArrayList(map.keySet());
        List list2=new ArrayList(map.values());*/

         /* Map<String,Integer> map=new HashMap<String,Integer>();
        List list=new ArrayList(map.entrySet());
        List list1=new ArrayList(map.entrySet());
        List list2=new ArrayList(map.keySet());
        List list3=new ArrayList(map.values());*/

        Map<String,Integer> map= new HashMap<>();
        map.put("A",1);
         List l=new ArrayList<>();
        List list1=new ArrayList<>(map.entrySet());
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        List<String> list2=new ArrayList<>(map.keySet());
        List<Integer> list3=new ArrayList<>(map.values());
        for (Map.Entry me: map.entrySet()){
             list1.add(me.getValue());
             list1.add(me.getKey());
        }
        for (Map.Entry<String,Integer>me1:map.entrySet()){
            l.add(me1.getKey());
            l.add(me1.getValue());
        }
        //map.forEach((k,v)->System.out.println(k +"-"+v));
        // java 8
     List list4=   map.keySet().stream().collect(Collectors.toList());
     List <Map.Entry<String,Integer>>list5=   map.entrySet().stream().collect(Collectors.toList());
      List <String>list6= map.keySet().stream().collect(Collectors.toList());
          List <Integer>list7=map.values().stream().collect(Collectors.toList());
          list5.forEach((k)->System.out.println(k));
          map.forEach((k,v)->System.out.println(k+""+v));


    }


}
