package java8;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {
   public static void main(String[] args) {
	   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	    long count =  myList.stream()
	                        .count();
	    //System.out.println(count);
		List<Integer>mylist1=Arrays.asList(1,2,3,4);
	int sum=	mylist1.stream().reduce(0,(a,b)->a+b);
	   System.out.printf(""+sum);
}  

}
