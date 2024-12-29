package code_practice;

public class PalindromeString {
    public static void main(String[] args) {
       boolean b= isPalindrome("Madam");
       boolean c= twoPointerIsPalindrome("madam");
       System.out.println(c);
    }



   public static boolean isPalindrome(String str) {
        // initialization variable and assign value
        String rev="";
 boolean ans=false;
       for (int i = str.length()-1; i >=0 ; i--){
           rev=rev + str.charAt(i);
       }
if (rev.equals(str)){
 ans=true;
}

        return ans;
    }
    public  static boolean twoPointerIsPalindrome(String str){
        int i=0; int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!= str.charAt(j))
                return  false;
            i++;
                j--;
        }
        return true;
    }
}