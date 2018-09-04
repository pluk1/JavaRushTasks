package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

//        Map<String, Double> treeMap = new TreeMap<>(map);
//        treeMap.forEach((k, v) -> System.out.println(k + " " + v));

        Map<String, Double> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));



        Double salary = 0.0;

        for (Map.Entry<String, Double> entry : result.entrySet()) {

            if (entry.getValue()>= salary){
                System.out.println(entry.getKey());
                salary = entry.getValue();
            }

        }

        fr.close();
        br.close();

    }
}
