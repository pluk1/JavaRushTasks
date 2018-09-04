package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }


        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код

        Map<Character, Integer> map = new HashMap<>();

        // int counter = 0;

//        for (int i = 0; i < alphabet.size(); i++) {
//            map.put(alphabet.get(i), counter);
//        }


//        for (int i = 0; i < alphabet.size(); i++) {
//
//            int counter = 0;
//
//            for (int j = 0; j < list.size(); j++) {
//
//                for (int k = 0; k <list.get(j).length(); k++) {
//
//                    if (list.get(j).charAt(k) == alphabet.get(i)){
//
//
//                        counter++;
//
//                    }
//                    System.out.println(counter, );
//
//                }
//            }
//        }

        String text = list.toString();
        char[] chars = text.toCharArray();
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == alphabet.get(i)) {
                    count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);

        }

    }
}