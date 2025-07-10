package hasmmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCountSequence {
    public static void main(String[] args) {
        String input="JAVA";
        Map<Character,Integer>countMap=new LinkedHashMap<>();

        for (char ch:input.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);

        }
        StringBuilder result=new StringBuilder();
        for (Map.Entry<Character,Integer>entry:countMap.entrySet()) {
         result.append(entry.getKey()).append(entry.getValue());


        }
        System.out.println(result);
    }
}
