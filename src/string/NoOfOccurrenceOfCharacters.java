package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NoOfOccurrenceOfCharacters {
	static final int MAX_CHAR = 256;
	public static void main(String[] args) {
		 String str = "geeksforgeeks";
	       // getOccurringChar(str);
	      //  getOccurringHashMap();
		// getcharCount("test");
		// getOccuranceStringCount();
		 //getOccuranceInteger();
		 getOccurancechar();
	}
	 static void getOccurringChar(String str)
	    {
	      int count []=new int [MAX_CHAR];

	        int len = str.length();
	        // Initialize count array index
	        for (int i = 0; i < len; i++)
	            count[str.charAt(i)]++;
	 
	        // Create an array of given String size
	        char ch[] = new char[str.length()];
	        for (int i = 0; i < len; i++) {
	            ch[i] = str.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (str.charAt(i) == ch[j])
	                    find++;
	            }
	 
	            if (find == 1)
	                System.out.println(
	                    "Number of Occurrence of "
	                    + str.charAt(i)
	                    + " is:" + count[str.charAt(i)]);
	        }
	        
}
	 public static void getOccurringHashMap()
	    {
	        String str = "GeeksForGeeks";
	        ArrayList<Character> al = new ArrayList<>();
	        for (int i = 0; i < str.length(); i++) {
	            al.add(str.charAt(i));
	        }
	        HashMap<Character, Integer> hm = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            hm.putIfAbsent(al.get(i),
	                           Collections.frequency(al,al.get(i)));
	        }
	 
	        for (Map.Entry<Character,Integer> e : hm.entrySet()) {
	            System.out.println(
	                "Character is :"+e.getKey()+ " and its count is string is "+ e.getValue());
	        }
	    }
	 //https://www.youtube.com/watch?v=3mz_3UBlK0c
	 public static void getcharCount(String str){
		  char strArrary[]=str.toCharArray();
		  Map<Character,Integer>hm=new HashMap<>();
		  for(char c:strArrary) {
			 if (hm.containsKey(c)) {
				 hm.put(c,hm.get(c)+1);
				
			}
			 else {
				 hm.put(c,1);
			 }
		  }
	System.out.print(hm);
		 
	 }
	 public static  void getOccuranceStringCount() {
		 List<String> colors = Arrays.asList("red","green","red","yellow","green");
		 
		  Map<String,Integer>hm=new HashMap<>();
		  for(String str:colors) {
			  if (hm.containsKey(str)) {
				hm.put(str, hm.get(str)+1);
			}
			  else {
				  hm.put(str, 1);
			  }
		}
		  System.out.print(hm);
	 }
	 public static  void getOccuranceInteger() {
		 int arr[]= {1,3,4,5,3,1,3,4,5,5};
		Map<Integer,Integer>hm= new HashMap<>();
		for(int i:arr) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
		}
			else {
				hm.put(i, 1);
			}
	 }
		System.out.print(hm);
	 }
	 public static  void getOccurancechar() {
		 // String str="chhote lal pal"; 
		  String input = "JavaJavaEE";
		 // char []c=str.toCharArray();
		  Map<Character,Integer>hm= new HashMap();
		  char ch[]=input.toCharArray();
		  for(char c :ch) {
			  if (hm.containsKey(c)) 
				hm.put(c,hm.get(c)+1);
			  else
				  hm.put(c,1);
		  }
		
		System.out.println(hm);
		// count Dublicate character more than count getValue>1
		  for (Entry < Character, Integer > entry: hm.entrySet()) {

	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
	            }
	        }
		  
		  
	 }
}
