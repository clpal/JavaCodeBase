package java8.GroupBy;

import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String s="aabbcc";
        s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((x,y)->System.out.print(x+""+y));
    }
}
