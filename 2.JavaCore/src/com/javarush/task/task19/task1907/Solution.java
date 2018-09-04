package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader flNameReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = flNameReader.readLine();
        flNameReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bfReader = new BufferedReader(fileReader);

        int count = 0;

        ArrayList<String> arrStr = new ArrayList<>();
        while (bfReader.ready()) {

            String[] strArr = bfReader.readLine().split("[\\W]");
            for (String str : strArr) {
                arrStr.add(str);
            }

        }

        Pattern world = Pattern.compile("\\b[Ww][Oo][Rr][Ll][Dd]\\b");


        for (String stri : arrStr) {
            Matcher matcher = world.matcher(stri);
            if (matcher.find()) {
                count++;
            }
        }

        fileReader.close();
        bfReader.close();
        System.out.println(count);
    }
}
