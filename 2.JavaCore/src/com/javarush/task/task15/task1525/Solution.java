package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            while (fileReader.ready()) {
                lines.add(fileReader.readLine());
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);


    }
}
