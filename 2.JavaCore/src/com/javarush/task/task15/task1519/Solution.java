package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr;
        do {

            inputStr = reader.readLine();


            if (inputStr.equals("exit")) {
                break;

            }

            try {
                if (inputStr.contains(".")) {
                    print(Double.parseDouble(inputStr));
                } else if (Integer.parseInt(inputStr) < 128 && Integer.parseInt(inputStr)>0) {
                    print(Short.parseShort(inputStr));
                } else if (Integer.parseInt(inputStr) >= 128 || Integer.parseInt(inputStr)<=0) {
                    print(Integer.parseInt(inputStr));
                }
            } catch (Exception e) {
                print(inputStr);
            }
        } while (true);
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
