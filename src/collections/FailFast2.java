package collectionsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast2 {
    public static void main(String[] args) {
        //creating ArrayList
        ArrayList<String> students = new ArrayList<String>();

        students.add("Emma");
        students.add("Paul");
        students.add("Walker");
        students.add("Elanie");
        students.add("Amara");
        Iterator iterator =students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            students.remove(1);
        }
    }
}
