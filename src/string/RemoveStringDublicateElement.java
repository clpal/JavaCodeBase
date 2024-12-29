package string;

public class RemoveStringDublicateElement {
    public static void main(String[] args) {
        String str="hello";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
               char currentChar=str.charAt(i);
                  if (result.indexOf(currentChar)==-1){
                      result+=currentChar;
                  }


        }
        System.out.print(result);
    }
}
