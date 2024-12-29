package hasmmap;

import java.util.HashMap;
// contract equal vs hashcode
public class Test{
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        HashMap<Test,String> map=new HashMap();
        map.put(t1,"Hell0");
        map.put(t2,"Hi");
        System.out.println(map);


    }

}


