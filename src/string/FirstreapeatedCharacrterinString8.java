package string;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class FirstreapeatedCharacrterinString8 {

	public static void main(String[] args) {
		  String input = "Feel the need";
	        Set<Integer> seen = new HashSet<>();
	        OptionalInt first = input.chars() .filter(i -> !seen.add(i)).findFirst();
	        
	        if (first.isPresent()) {
	            System.out.println((char) first.getAsInt());
	        }
	    

	}

}
