package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {

        String fileName = args[0];

        int letterrs = 0;
        int spaces = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName))) {
            while (isr.ready()) {
                char ch = (char) isr.read();
                if (Character.isSpaceChar(ch)) {
                    spaces++;
                }
                letterrs++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double am = (double) (letterrs/spaces)*100;

        System.out.println(String.format("%2.f",am));



    }
}
