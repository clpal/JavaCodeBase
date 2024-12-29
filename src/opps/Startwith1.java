package opps;

import java.util.*;
import java.util.stream.Collectors;

public class Startwith1 {

    public static void main(String[] args) {
 /*    //   List list=new ArrayList<>();
        //List list=new ArrayList<>();
        Set list=new HashSet<>();
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(3);
        list.add(15);
        list.add(null);
       // list.add(null);
      //  list.add(null);
        list.add(1);
     //   list.add("aaa");
        LinkedHashSet gg
        list.add(null);
        list.add(3);
        list.add(10);
        System.out.println(""+list);*/


        // linked hashset
        LinkedHashSet<Integer> set=new LinkedHashSet();
      set.add(2);
      set.add(6);
      set.add(1);
        set.add(null);
      set.add(1);
      set.add(8);
      set.add(12);

        set.add(null);
        Collections.synchronizedSet(set);

        Iterator<Integer> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

