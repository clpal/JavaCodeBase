package hasmmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainHashmp {
    public static void main(String[] args) {
        Map<Employee, Student>hashMap =new HashMap();
           Employee e=new Employee(101,"2000");
           hashMap.put(e,new Student(1,"Aman"));

        Employee e1=new Employee(101,"2000");
        hashMap.put(e1,new Student(9,"Jay"));
        System.out.println(hashMap.size());
      
       
     
        //V get(Object key);-->---> it is return Value
        //  V put(K key, V value);---> it is return Value
  
    }
}
