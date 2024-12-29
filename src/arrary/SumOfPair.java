package arrary;

import java.util.Arrays;

public class SumOfPair {

	public static void main(String[] args) {
		/*
		 * //int arr[] = {0, -1, 2, -3, 1}, x= 0; int arr[] = {1, -2, 1, 0, 5}; int x =
		 * 0;
		 * 
		 * int size=arr.length; if(checksum(arr,size,x)) { System.out.print("true"); }
		 * else { System.out.print("false"); }
		 */
		
		int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int arr_size = A.length;
 
        // Function calling
        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	public static boolean checksum(int arr[],int size,int num) {
	// TC o(n*2)
		//*
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==num) {
					System.out.print("("+arr[i]+","+arr[j]+")");
					return true;
				}
				
			}
		}
		return false;
	}
	// Two Pointer approach
	// O(NlogN)
	 static boolean
	    hasArrayTwoCandidates(int A[], int arr_size, int sum)
	    {
		 int l,r;
		 Arrays.sort(A);
		 l=0;r=arr_size-1;
		 while(l<r) {
			 if(A[l]+A[r]==sum){
					System.out.print("("+A[l]+","+A[r]+")");
				 return true;
			 }
			 else if(A[l]+A[r]<sum) {
				 l++;
				 
			 }
			 else {
				 r--;
			 }
		 }
		 
		 return false;
	    }
}
