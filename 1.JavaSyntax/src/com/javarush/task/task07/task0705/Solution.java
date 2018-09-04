package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArray = new int[20];

        for (int i = 0; i < bigArray.length; i++) {

            bigArray[i] = Integer.parseInt(reader.readLine());

        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = bigArray[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = bigArray[i+10];
            System.out.println(array2[i]);
        }

    }
}
