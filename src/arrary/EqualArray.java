package arrary;

import java.util.Arrays;
// https://www.geeksforgeeks.org/check-if-two-arrays-are-equal-or-not/
public class EqualArray {

	public static void main(String[] args) {
		int  arr1[] = {1, 2, 5, 4, 0, 2, 1} ;
				int arr2[] = {2, 4, 5, 0, 1, 1, 2} ;
			
				boolean b=equalorNot(arr1,arr2);
				if (b) {
					System.out.print("YES");
				} else {
					System.out.print("No");
				}

	}
	static boolean equalorNot(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		if(n!=m)
			return false;
		// Sort both the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//Then linearly compare elements of both the arrays
		for (int i = 0; i < arr2.length; i++) {
			// If all are equal then return true, else return false
			if (arr1[i]!=arr2[i]) {
				return false;
				
			}
			
		}
		return true;
		 
	 }

}
