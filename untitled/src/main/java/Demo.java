import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        String name = "ashish kumar verma";
        Map<Character, Long> characterLongMap = name.chars().mapToObj(c -> (char) c).filter(character ->character !=' ').collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()));
        characterLongMap.forEach((k,v)-> System.out.println(k+"-"+v));
    }
}
