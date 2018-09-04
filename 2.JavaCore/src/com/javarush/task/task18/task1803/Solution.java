package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Map<Integer,Integer> map = new HashMap<>();



        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            if (map.containsKey(data)){
                map.put(data,map.get(data)+1);
            }else {
                map.put(data,1);
            }

        }

        bufferedReader.close();
        fileInputStream.close();

        Set<Map.Entry<Integer,Integer>> set = new HashSet<>(map.entrySet());
        for (Map.Entry<Integer,Integer> entry : set){
            if (entry.getValue()>2){
                System.out.print(entry.getKey() + " ");
            }

        }
    }
}
