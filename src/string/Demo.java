package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		int a=9%10;// module// remainder
		int b=9/10;//divider
		 System.out.println(a);
		 System.out.println(b);
		 Map<String ,Integer> hm=new HashMap();
		 hm.put("noida", 5);
		List<String>strArray=Arrays.asList("noida","delhi","gurgaon","noida","delhi");
		
		 for(String str:strArray) {
			  if (hm.containsKey(str)) {
				  hm.put(str, hm.get(str)+1); //entry data in hash map store as key value as increment if present
				
			}
			  else {
				  hm.put(str, 1);
			  }
		 }
	
			 System.out.println(hm);
			 
		

	}

}
