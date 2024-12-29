package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyofArraylistElement {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(2,2,4,3,1,4,1,1,2,4,2);
        list.stream().map(c->(int)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).forEach((element,frequency)->System.out.println(element+" ->"+frequency));
    }
}
