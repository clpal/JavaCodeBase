package string;


import java.util.regex.Pattern;
// https://www.geeksforgeeks.org/reverse-words-given-string-java/
public class ReverseWords {

	public static void main(String[] args) {

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
	

	}
	static String reverseWords(String str)
    { 
	Pattern pattern=	Pattern.compile("\\s");
	String []temp=pattern.split(str);
	String result="";
		for (int i = 0; i < temp.length; i++) {
			if (i==temp.length-1) 
				result=temp[i]+ result;
			
			else 
				result= " "+temp[i] +result ;
			
		}
		return result;
    }
}
