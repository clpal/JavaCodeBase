package sorting.bubble;

import java.util.Arrays;

public class BubbleSortIterate {
	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
	       
        bubbleSort(arr, arr.length);
          
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr, int length) {
		int temp=0;
		boolean swapped;
		for(int i=0;i<arr.length-1;i++) {
		 swapped=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
					
				}
			
			}
			if (swapped=false) {
				break;
			}
		
	}
		
	}

}
