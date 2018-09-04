package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        //
//        //FileInputStream fileInputStream = new FileInputStream(args[0]);
//
//        FileReader fileInputStream = new FileReader(args[0]);
//
//        int engCount = 0;
//
//        List<String> lines = new ArrayList<String>();
////
////        while (fileInputStream.available() > 0){
////            int i = fileInputStream.read();
////            if ((i >= 97 && i <= 122)||(i >= 65 && i <= 90)){
////                engCount++;
////            }
////        }
//
//        //
//        while (fileInputStream.ready()){
//            char a = (char)fileInputStream.read();
//            if((a>='a'&a<='z')||(a>='A'&a<='Z')){
//
//                engCount++;
//            }
//        }
//
//        fileInputStream.close();


        String fileName = args[0];
        //String fileName = "C:\\Temp\\JavaRush_test_files\\task1816.txt";
        int count = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName))) {
            while (isr.ready()) {
                char ch = (char) isr.read();
                if ("abcdefghijklmnopqrstuvwxyz".indexOf(Character.toLowerCase(ch)) > -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
