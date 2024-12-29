package arrary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// https://www.geeksforgeeks.org/frequent-element-array/

// we can check of string character element as
public class FrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] arr = { 40, 50, 30, 40, 50, 30, 30 };

        int n = arr.length;
          
        System.out.println(mostFrequent(arr, n));
	}
	static int mostFrequent(int arr[], int n)
    {
		// Insert all elements in hash
        Map<Integer, Integer> hp =
               new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }
     // find max frequency.
        int max_count = 0, res = -1;
          
        for(Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        //hm.forEach(k,v)->s->(System.out::)
        
        return res;
		
    }
}
