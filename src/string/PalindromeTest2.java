package string;

import java.util.Stack;

public class PalindromeTest2 {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String inputString="aabbaa";
		String reverseString="";
		Stack stack= new Stack();
		int i=inputString.length()-1;
		

	      while (i>=0){
	    	  
	         reverseString = reverseString + inputString.charAt(i);
	      i-- ;
	      }
	      if (inputString.equals(reverseString))
	         System.out.println("Input string is a palindrome.");
	      else
	         System.out.println("Input string is not a palindrome.");
	}

}
