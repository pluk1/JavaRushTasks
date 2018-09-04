package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        if (num1<=0 ){
            throw new Exception();
        }


        int num2 = Integer.parseInt(reader.readLine());
        if (num2<=0 ){
            throw new Exception();
        }
        while (num2 !=0) {
            int tmp = num1%num2;
            num1 = num2;
            num2 = tmp;
        }


        System.out.println(num1);
    }
}
