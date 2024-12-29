package Test;
import java.util.HashMap;
import java.util.Map;

class Student {
    public Integer id;
    public String fName;
    public String LName;
    public String cLass;

    public Student(int i) {
        id = i;
    }


    @Override
    public String toString() {
        return "{'id':"+id+",'fName':'"+fName+"','LName':'"+LName+"','cLass':'"+cLass+"'}";
    }


}

public class TestMap {

    public static void main(String[] args) {
        Map<Student, String> mapStu = new HashMap<>();
        Student obj2 = new Student(2);
        Student obj3 = new Student(3);
        Student obj4 = new Student(4);
        Student obj5 = new Student(2);

        mapStu.put(obj2, "");
        mapStu.put(obj3, "");
        mapStu.put(obj4, "");
        mapStu.put(obj5, "");

        System.out.println(mapStu);
        System.out.println(mapStu.size());
        Map<Integer, String> mapInteger = new HashMap<>();

        mapInteger.put(1, "");
        mapInteger.put(2, "");
        mapInteger.put(2, "");
        mapInteger.put(2, "");
        mapInteger.put(2, "");

        System.out.println(mapInteger.size());

    }

}
