package string;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
// How to find a first duplicate character in the given string?
// https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
public class FirstreapeatedCharacrterinString {
    static Set<Character>h=new HashSet<>();
  static char  firstRepeating(char ch[]){
      for (int i = 0; i <ch.length-1 ; i++) {
           char c=ch[i];
          if (h.contains(c))
              return  c;

           else
               h.add(c);
      }
            
      return '\0';

    }


    public static void main(String[] args) {
        // String str="amazonian";
    	//String str="geeksforgeeks";
    	String str="Feel the need";
        // String str="abcd";
         char arr[]=str.toCharArray();
        System.out.println(firstRepeating(arr));
    }
}
