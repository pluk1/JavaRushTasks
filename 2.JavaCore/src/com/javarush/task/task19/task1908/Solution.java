package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader flNameReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = flNameReader.readLine();
        String fileName2 = flNameReader.readLine();
        flNameReader.close();

        BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2));

        Pattern number = Pattern.compile("^\\d+$");

        ArrayList<String> arrStr = new ArrayList<>();
        while (bfReader.ready()){
            String[] strArr = bfReader.readLine().split(" ");
            for (String str: strArr
                 ) {
                arrStr.add(str.trim());
            }

        }

        arrStr.forEach(s -> {
            try {
                Matcher matcher = number.matcher(s);
                if (matcher.find()) {
                    bfWriter.write(s + " ");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bfReader.close();
        bfWriter.close();
    }
}
