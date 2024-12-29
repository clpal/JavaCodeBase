package arrary;

public class LeftRotatedKTimes {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
	    int N = arr.length;
	 
	    int K = 2;
	    LeftRotate(arr, K,N);
		StringBuffer sb=new StringBuffer();
		
		//printing the elements of the array
        for(int t1=0;t1<arr.length;t1++)
            sb.append(arr[t1]+" ");
       //System out.println(sb);
       System.out.println(sb);

	}

	private static void LeftRotate(int[] arr, int d, int n) {
		 d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			 arr[end]=temp;
			 start++; end--;
		}
	    
		
	}

}
