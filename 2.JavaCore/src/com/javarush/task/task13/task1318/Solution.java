package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        InputStream inStream = new FileInputStream(filename);

        String file = "";
        while (inStream.available()>0)
        {
            file += Character.toString((char) inStream.read());
        }
        System.out.println(file);
        inStream.close();
        reader.close();

//        System.out.println(file);
//        try {
//            InputStream inStream = new FileInputStream(filename);
//            //MyClass myObject = new MyClass();
//
//
//            while (inStream.available() > 0) {
//                int data = inStream.read(); //читаем один int из потока для чтения
//
//                System.out.println(data);
//                //myObject.write(data); //записываем прочитанный int в другой поток.
//            }
//
//            inStream.close(); //закрываем потоки
//        } catch (Exception e) {

 //       }
    }
}