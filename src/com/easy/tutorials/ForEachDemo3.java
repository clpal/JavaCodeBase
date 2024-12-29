package com.easy.tutorials;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemo3 {
    public static void main(String[] args) {
        Map<Long, User> map = new HashMap<>();
        map.put(1L, new User(100L, "chhotelalpal", "chhotelalpal"));
        map.put(1L, new User(100L, "anju", "chhotelalpal"));
        map.put(1L, new User(100L, "aadi", "chhotelalpal"));
        for (Map.Entry<Long, User> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);


        });

    }
}