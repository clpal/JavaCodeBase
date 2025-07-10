package java8;

import java.util.stream.IntStream;

public class StringPattern {
    public static void main(String[] args) {
        String str="2a3b4c5d";
        IntStream.range(0,str.length()).filter(i->i%2==0).mapToObj(i->{
            int count=Character.getNumericValue(str.charAt(i));
            char ch=str.charAt(i+1);
            return String.valueOf(ch).repeat(count);
        }).forEach(System.out::println);
    }
}
