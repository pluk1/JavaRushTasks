package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put("Name" + i, "Surname" + i);
        }


        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int sameNames = 0;

        for (String s : map.values()) {
            if (s.equals(name)) sameNames++;
        }
        return sameNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int sameLastNames = 0;

        for (String s : map.keySet()) {
            if (s.equals(lastName)) sameLastNames++;
        }

        return sameLastNames;

    }

    public static void main(String[] args) {

      HashMap<String, String> map1 = createMap();

      getCountTheSameFirstName(map1, "pe");
      getCountTheSameLastName(map1, "asa");


    }
}
