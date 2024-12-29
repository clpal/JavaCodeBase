package arrary;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 8, 1, 9, 7};

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		System.out.println("Second largest element: " + secondLargest);
	}

}
