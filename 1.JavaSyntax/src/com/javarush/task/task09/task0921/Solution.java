package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }


    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            while (true) {


                try {

                    String input = reader.readLine();

                    arrayList.add(Integer.parseInt(input));


                } catch (NumberFormatException e) {

                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                    }
                    break;
                }

            }

        } catch (IOException e) {

        }

    }
}
