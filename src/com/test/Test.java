package com.test;

public class Test {

   public static String newstr="";
    public static void main(String[] args) {
        String str="Madam".toLowerCase();
         char ch[]=str.toCharArray();

        for (int i =ch.length-1; i>=0 ; i--) {
            newstr+=ch[i];

        }
        if (newstr.equals(str)) {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println(" No Palindrome String");
        }

    }
  //  O (n)
}
