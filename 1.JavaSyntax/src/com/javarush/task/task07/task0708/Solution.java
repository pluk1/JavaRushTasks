package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings =new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5 ; i++) {

            String s = reader.readLine();
            strings.add(s);

        }

        String maxString = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);

            if (currentString.length() > maxString.length()){
                maxString = currentString;
            }
        }

        for (int i = 0; i < strings.size(); i++) {

            String currentString = strings.get(i);

            if (currentString.length() == maxString.length()){
                System.out.println(currentString);
            }

        }

    }
}
