package string;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesCharacter {
// https://www.javaguides.net/2020/06/java-8-count-duplicate-characters-in-string.html
	// https://www.geeksforgeeks.org/java-program-to-print-all-duplicate-characters-in-a-string/
	public static void main(String[] args) {
		 // given input string
        String input = "JavaJavaEE";

        // create a HashMap
        Map < Character, Integer > countDuplicateMap = new HashMap < > ();

        // Converts this string to a new character array.
        char[] charArray = input.toCharArray();

        for (char c: charArray) {

            if (countDuplicateMap.containsKey(c)) {

                // get value by key and increment it's value by a
                countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
            } else {
                countDuplicateMap.put(c, 1);
            }
        }


        for (Entry < Character, Integer > entry: countDuplicateMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

	

}
