package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];

//        String fileName = "/Users/cartman/Documents/text1.txt";

        FileReader fr = new FileReader(fileName);

        BufferedReader br = new BufferedReader(fr);

        Map<String, Double> map = new HashMap<>();

        while (br.ready()) {

            String[] arr = br.readLine().split(" ");

            if (map.containsKey(arr[0])) {

                for (Map.Entry<String, Double> entry : map.entrySet()) {

                    if (entry.getKey().equals(arr[0])) {
                        entry.setValue(entry.getValue() + Double.valueOf(arr[1]));
                    }
                }
            } else {
                map.put(arr[0], Double.valueOf(arr[1]));
            }
        }

        Map<String, Double> treeMap = new TreeMap<>(map);

        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        fr.close();
        br.close();

    }
}
