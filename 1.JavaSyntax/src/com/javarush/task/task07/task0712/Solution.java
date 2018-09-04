package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        String maxStr = list.get(0);
        String minStr = list.get(0);
        int max = 0;
        int min = 0;


        for (int i = 0; i < list.size(); i++) {
            String currentStr = list.get(i);


            if (currentStr.length() > maxStr.length()) {

                maxStr = currentStr;
                max = i;
            }

            if (currentStr.length() < minStr.length()) {
                minStr = currentStr;
                min = i;

            }

        }

        if (max < min) {
            System.out.println(list.get(max));
        } else System.out.println(list.get(min));


    }
}
