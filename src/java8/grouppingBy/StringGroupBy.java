package java8.grouppingBy;

import java.util.stream.Collectors;

public class StringGroupBy {
    public static void main(String[] args) {
        String str="Lala";

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).
                forEach((character, frequency) -> System.out.println(character + ": " + frequency));



    }
}
