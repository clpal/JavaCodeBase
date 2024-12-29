package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		// 1st way
		int max=myList.stream().max(Integer::compare).get();
		System.out.println(max);
		
		int min=myList.stream().max(Integer::compare).get();
		System.out.println(min);
		// 2nd way
		int max1= myList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max1);
		
	// first element
				int max2= myList.stream().sorted().findFirst().get();
				System.out.println(max2);
	// 2nd Max
				// 2nd way
				int max3= myList.stream().sorted(Comparator.reverseOrder()).skip(2).distinct().findFirst().get();
				System.out.println(max3);
	}

}
