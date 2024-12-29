package string.dublicate;

/*Remove duplicates from a string
        Input: hello,apple
        Output: helo,aple*/
public class RemoveDublicateElement {
    public static void main(String[] args) {
       // String s="hello";
        String s="apple";
  String result="";
        for (int i = 0; i < s.length() ; i++) {
           char currentChar=s.charAt(i);
            if (result.indexOf(currentChar)==-1)
                result+=currentChar;
        }
        System.out.println(result);
    }
}
