package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SecondHighestNumber {

	public static void main(String[] args) {

		List<Integer>list =Arrays.asList(1,4,6,8,8,9,9,6);
	
		 int secondLargestNumber = list .stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		 list.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
	System.out.println(secondLargestNumber);

	}

}
