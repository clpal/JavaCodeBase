package collectionsa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastIterator {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String>hashMap=new ConcurrentHashMap();
        hashMap.put(101,"Akash");
        hashMap.put(104,"Vikash");
        hashMap.put(102,"Chhote");
        Iterator iterator=hashMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(hashMap.get(iterator.next()));// thread 1
            hashMap.put(105,"Aman");// // thread 2
        }
    }



}
