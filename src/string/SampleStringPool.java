package string;

public class SampleStringPool {
    public static void main(String[] args) {
        String s1="hello";

        String s2="hello";

        String s3=  new String("hello");
        String s4=  new String("hello");

      System.out.println(s1==s2);
      System.out.println(s1==s3);
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s3==s4);
      System.out.println(s3.equals(s4));

       /* s1==s2  ->true

        s1==s3->false

        s1.equal(s2)-> true

        s2.equal(s3)->true*/
    }
}
