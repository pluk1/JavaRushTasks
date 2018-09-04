package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(readerFileName.readLine());
        int res = Integer.MAX_VALUE;

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();

            if (data < res){
                res = data;
            }

        }
        fileInputStream.close();
        readerFileName.close();
        System.out.println(res);

    }
}
