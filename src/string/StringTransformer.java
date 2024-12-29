package string;
//Write a function that transforms string into a new string. New string does not contain repeating letters but contains a number after every
// letter that means how many times the letter was repeated in the original string
public class StringTransformer {
    public static String transformString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(currentChar).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        // String inputString = "aaabbcddd";
        //  String inputString = "aaaabbbaab";
        String inputString = "aab";
        String transformedString = transformString(inputString);
        System.out.println(transformedString);  // Output will be "a3b2c1d3"
    }
}
