package Java8Pro;

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {


         Set set=new HashSet<>();
        set.add("c");
         set.add("a");
         set.add("b");

         set.stream().forEach(x->System.out.println(x));
       /* List list= Arrays.asList(1,2,4,5,6,7);
        //list.stream().forEach(s->{System.out.println(s)});
       // list.stream().forEach(System.out::println);


       List <User>userList=Arrays.asList(new User(1,"Anant","backend"),new User(1,"Chhote","IT"));

        userList.stream().forEach(n->{System.out.println(n.getAge());});

        Map<Integer,User>map=new HashMap<>();
        map.put(1,new User(1,"Anant","backend"));
        map.put(2,new User(11,"Aman","IT"));
     *//*   map.entrySet().stream().forEach(c->{System.out.println(c.getKey());
            System.out.println(c.getValue());
        });*//*

       map.forEach((k,v)->{
           System.out.println(v);
           System.out.println(k);
               }

       );*/

    }
}
