package java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		// String str="prepinsta";
		 String str="abgbggaq";
		 Map<Character,Integer>hm=new LinkedHashMap();
		  for(char c:str.toCharArray()) 
			 if(hm.containsKey(c)) 
				 hm.put(c, hm.get(c)+1);
			 else
				 hm.put(c, 1);
			/*
			  for (Character ch : str.toCharArray()) { 
			  hm.put(ch, hm.containsKey(ch) ?
			  hm.get(ch) + 1 : 1); }
			 */
			 
		  char key=hm.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		      
		  
		  System.out.println(key);

	}
	 public static Character findFirstNonRepeating(String string) {
	        Map<Character,Integer> map = new LinkedHashMap();

	        for (Character ch : string.toCharArray()) {
	            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
	        }
	        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
	    }

}
