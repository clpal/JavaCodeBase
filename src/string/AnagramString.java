package string;

import java.util.Arrays;

// https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/


public class AnagramString {
    public static void main(String[] args) {
       // String str1 = "gram";
        String str1 = "listen";
       // String str2 = "arm";
        String str2 = "silent";
        char []ch1=str1.toCharArray();
        char []ch2=str2.toCharArray();
        if (areAnagram(ch1,ch2)) {
            System.out.println("Aragram");

        }
        else {
            System.out.println("No Aragrame");
        }
    }

    private static boolean areAnagram(char []ch1,char ch2[]) {
        // get both length
        int n1=ch1.length;
        int n2=ch2.length;
        // if both string length not same it is not Anagram
        if (n2 !=n2) {
            return false;

        }
        // sort both
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       // boolean result = Arrays.equals(ch1, ch2);
        // Compare sorted strings
        for (int i = 0; i <n1 ; i++) {
            if (ch1[i] != ch2[i]) {
           return  false;
            }
        }

        return true;
    }
}
