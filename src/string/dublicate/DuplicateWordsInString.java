package string.dublicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		duplicateWords("java guides java abc java");

        //duplicateWords("Java is java again java");

        //duplicateWords("Super Man Bat Man Spider Man");

	}

	private static void duplicateWords(String str) {
	 // Used split() method to split input String into words.
		String words[]=str.split(" ");
		Map<String,Integer>hm=new HashMap();
		 for(String word:words) {
			 if (hm.containsKey(word)) 
				 hm.put(word,hm.get(word)+1);
			 else
				 hm.put(word, 1);
			
			 
		 }
		 System.out.println(hm);
			//extracting all word
			Set<String>wordsInString=hm.keySet();
		
			   for(String word:wordsInString) {
				   //if(hm.get(word)>1) {
					   System.out.println(word+": "+hm.get(word));
				   //}
				   
			   }
	}


}
