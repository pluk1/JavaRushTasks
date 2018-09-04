package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());

        }


        int strLen = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {


            if (list.get(i).length() > list.get(i + 1).length() && i ==0){
                System.out.println(0);
                break;
            }

            if (list.get(i).length() > list.get(i + 1).length() && i < list.size() && i > 0) {
                System.out.println(i + 1);
                break;
            }


        }

    }
}

