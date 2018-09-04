package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }


        // Collections.sort(list);

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        ArrayList<Integer> intArr = new ArrayList<Integer>();
        ArrayList<String> strArr = new ArrayList<String>();


        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {

                intArr.add(Integer.parseInt(array[i]));

            } else {
                strArr.add(array[i]);

            }
        }

        Collections.sort(strArr);
        Collections.reverse(intArr);

        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])){
                System.out.println(strArr.get(0));
                strArr.remove(0);
            }else {

                System.out.println(intArr.get(0));
                strArr.remove(0);
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
