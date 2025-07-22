package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateElement {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("A", "B", "A", "C", "B");
        // using stream API
      List newlist=  list.stream().distinct().collect(Collectors.toList());
        System.out.println(newlist);
     /*
        // Using Collection
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        System.out.println(result); // Output: [A, B, C]
*/

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }

        System.out.println(list); // Output: [A, B, C]

    }
}
