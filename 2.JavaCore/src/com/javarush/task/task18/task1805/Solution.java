package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        Map<Integer,Integer> map = new TreeMap<>();

        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            map.merge(data, 1, (a,b) -> a+b);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+ " ");
        }

        bufferedReader.close();
        fileInputStream.close();
    }
}
