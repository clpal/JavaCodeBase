package Java8Pro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CountList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,3,8);
        long count=list.stream().count();
        System.out.printf(""+count);
    }
}
