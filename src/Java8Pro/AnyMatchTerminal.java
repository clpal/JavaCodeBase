package Java8Pro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatchTerminal {
    public static void main(String[] args) {
        List<Integer>integers= Arrays.asList(1,23,4,5,6,7,2);
        boolean aa=integers.stream().anyMatch(x->x.intValue()==2);
        boolean cc=integers.stream().anyMatch(x->x.equals(2));
        System.out.printf(""+cc);
    }
}
