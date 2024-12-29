package arrary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countFreq {
	// https://www.geeksforgeeks.org/non-repeating-element/
// https://prepinsta.com/java-program/find-non-repeating-elements-in-an-array/
	
	public static void main(String[] args) {
		int arr[]={1,2,4,2,5,4,6,5,6};
		
		//int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10}; 
		int n = arr.length;
		// countFreq(arr, n); 
		// countFreqHashMap(arr, n); 
		 
		 
			/*
			 * int arr[] = { 9, 4, 9, 6, 7, 4 }; int n = arr.length;
			 */
	 
	        System.out.print(firstNonRepeating(arr, n));

	}
	 public static void countFreq(int arr[], int n)
	   {
	         boolean visited[] = new boolean[n];
	         Arrays.fill(visited, false);
	         // Traverse through array elements and
	         // count frequencies
	         for (int i = 0; i < n; i++) {

	            // Skip this element if already processed
	            if (visited[i] == true)
	             continue;

	            // Count frequency
	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                   visited[j] = true;
	                   count++;
	                }
	            }
	            if(count==1)   
	              System.out.println(arr[i]);
	   }
	} 
	  static int firstNonRepeating(int arr[], int n)
	    {
	        // Loop for checking each element
	        for (int i = 0; i < n; i++) {
	            int j;
	            // Checking if ith element is present in array
	            for (j = 0; j < n; j++)
	                if (i != j && arr[i] == arr[j])
	                    break;
	            // if ith element is not present in array
	            // except at ith index then return element
	            if (j == n)
	                return arr[i];
	        }
	 
	        return -1;
	    }
	 static void countFreqHashMap(int arr[], int n)
	   {
	      Map<Integer, Integer> mp = new HashMap<>();
	      int count_dis=0;
	      // Traverse through array elements and
	      // count frequencies
	      for (int i = 0; i < n; i++)
	      {
	         if (mp.containsKey(arr[i]))
	         {
	           mp.put(arr[i], mp.get(arr[i]) + 1);
	         }
	         else
	         {
	           mp.put(arr[i], 1);
	         }
	     }
	     // Traverse through map and print frequencies
	     for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	     {    if(entry.getValue()==1)
	          System.out.println(entry.getKey()+" ");
	     }
	     
	  }
	 

}
