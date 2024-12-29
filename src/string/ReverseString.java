package string;
// https://www.geeksforgeeks.org/reverse-a-string-in-java/
public class ReverseString {
    public static void main(String[] args) {
//System.out.print(reverseString("abc"));
//System.out.print(reverseString1("abc"));
//System.out.print(reversechar("abc"));
reversechar("madam");
    //	swiftrevese();
    }
    public static String reverseString(String str){  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev;  
    }  
    public static String reverseString1(String str){
    	 String rev="";
    	 for (int i = 0; i < str.length(); i++) {
    		  char ch=str.charAt(i); //extracts each character
    		   //rev=rev +ch;
    		  rev=ch+rev;//adds each character in front of the existing string
			
		}
    	return  rev;
    }
    public static void reversechar(String input) {
    	 char[] try1 = input.toCharArray();
    	 
         for (int i = try1.length - 1; i >= 0; i--)
             System.out.print(try1[i]);
    	
    }
    public static void swiftrevese()
    {
        String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
 
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
 
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }
}
