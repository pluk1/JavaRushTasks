package com.javarush.task.task08.task0816;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();


        for (int i = 0; i < 20; i++) {

            Date date = new Date();

            date.setDate(i);
            date.setMonth(i);
            date.setYear(1980 + i);
            map.put("LastName"+i,date);

        }


        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth()>4 && value.getMonth()<8){
                map.remove(key,value);
            }
        }
    }

    public static void main(String[] args) {

        removeAllSummerPeople(createMap());

    }
}
