package hasmmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,4,5,5,5,5,5};
        Map <Integer,Integer>map= new HashMap<Integer,Integer>();
         for ( int num: arr){
             /*if (map.containsKey(num))
             map.put(num,map.get(num)+1);
             else
             map.put(num,1);*/
             map.put(num, map.getOrDefault(num,0)+1);
         }
        for (Map.Entry<Integer,Integer> me:map.entrySet()){
            System.out.println(me.getKey() + "-"+me.getValue());

        }
    }
}
