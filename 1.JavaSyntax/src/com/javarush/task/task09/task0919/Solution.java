package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception{

        try{
            divisionByZero();

        }
        catch (Exception e){
            e.printStackTrace();

            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

            for (StackTraceElement element  : stackTraceElements ){

                System.out.println(element);
            }
        }

    }

    public static void divisionByZero() throws Exception{

        int a = 5/0;

        System.out.println(a);
    }
}
