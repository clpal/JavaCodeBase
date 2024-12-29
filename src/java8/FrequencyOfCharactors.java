package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharactors {
    public static void main(String[] args) {
      //  String str="chhotelalpal";
        String str="Hello";
/*        str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .forEach((charactor,element)->System.out.println(charactor +"->"+element));*/

        str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((charactor,element)->System.out.println(charactor +"->"+element));


    }
}
