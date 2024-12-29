package hasmmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintHashMap {
	public static void main(String[] args) {
		Map<String,Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("d", 4);
		hashMap.put("e", 5);
		System.out.println("ways of Java 8");
		hashMap.forEach((key,value)->System.out.println(key + "->"+value));
		
		System.out.println("ways of Java entrySet()");
		for( Entry<String, Integer>me : hashMap.entrySet()) 
			System.out.println(me.getKey() + "->"+me.getValue());
		
		System.out.println("Arrays.toString()");
		 
		System.out.println(Arrays.toString(hashMap.entrySet().toArray()));
		
	}

}
