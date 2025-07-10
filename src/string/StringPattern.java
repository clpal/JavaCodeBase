package string;

public class StringPattern {
    public static void main(String[] args) {
        String str="2a3b4c5d6e";
        for (int i=0;i<str.length();i+=2){
            int num=Character.getNumericValue(str.charAt(i));
            char  c=str.charAt(i+1);
            for (int j=0;j<num;j++){
                System.out.print(c);
            }
            System.out.println( );
        }
    }
}
