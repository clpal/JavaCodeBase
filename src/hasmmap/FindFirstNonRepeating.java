package hasmmap;

import java.util.*;
import java.util.Map.Entry;
// https://prepinsta.com/java-program/to-find-non-repeating-characters-in-a-string/
public class FindFirstNonRepeating {

	 public static void main(String[] args)
	    {

	       // String string = "prepinsta";
	        String string = "aaabbbcdde";
	        char ch = findFirstNonRepeating(string);
	            System.out.println("First non-repeating character is : " + ch);
	    }

	    public static Character findFirstNonRepeating(String str)
	    {
	        HashMap <Character,Integer> charhashtable =
	                new LinkedHashMap();
	        int len;
	      //  Character ch =null;
	        len = str.length();  // Scan string and build hash table

	       // for (int i = 0; i < len; i++)
	        for(char ch:str.toCharArray())
	        
	           // ch = str.charAt(i);

	            if(charhashtable.containsKey(ch)) 
	                // increment count corresponding to ch
	                charhashtable.put(ch, charhashtable.get(ch) + 1);
	            else
	                charhashtable.put(ch , 1);

	       // charhashtable.entrySet().stream().filter(c->c.getValue()==1).findFirst().get().getKey(); java 8
	        for(Entry<Character,Integer> entry: charhashtable.entrySet())
	        {
	            if(entry.getValue() == 1)
	                return entry.getKey();
	        }
	        
	        return null;
	        
	     
	  
	    }

}
