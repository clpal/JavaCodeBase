package java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeating {
	 public static Character findFirstNonRepeating(String string) {
	        Map<Character,Integer> map = new LinkedHashMap();

	        for (Character ch : string.toCharArray()) {
	            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
	        }
	        return map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
	    }


	    

	    public static void main(String[] args)
	    {
	        String string = "prepinsta";
	    	//String string = "aaabbbcdde";
	       // String string = "Java Hungry Blog Alive is Awesome";
	        char character = findFirstNonRepeating(string);
	        System.out.println("First non-repeating character is : " + character);
	        
	    }
}
