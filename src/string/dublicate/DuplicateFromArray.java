package string.dublicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFromArray {
	public static void main(String[] args) {
		//removehashset();
		final int[] a = { 10, 20, 30, 40, 50, 50, 10, 20 };
        Arrays.sort(a);// sorting array
       removeDuplicate(a);
     
		    
	}
	private static  void removehashset() {
		 Integer[]a=  {10,20,30,40,50,50,10,20};
	     Integer temp[]=new Integer[a.length];
	    Set<Integer>set= new HashSet<>();
	    int j=0;
	    for(Integer element :a ) {
	    	if(set.add(element)) {
	    		temp[j++]=element;
	    	}
	    	
	    }
	    // display array
		/*
		 * for(Integer element: temp) { System.out.println(element); }
		 */
	    for (int i = 0; i < j; i++) {
	    	System.out.println(temp[i]);
			
		}
		
	}
	 private static void removeDuplicate(final int[] a) {
		 int j=0;
   int temp[]=new int[a.length];
   for (int i = 0; i < a.length-1; i++) {
	    if(a[i]!=a[i+1]) {
	        temp[j++]=a[i];
}    
   } 
   temp[j++]=a[a.length-1];
   for (int k = 0; k < j; k++) {
  	 System.out.println(temp[k]);
		
	}
   }
}
