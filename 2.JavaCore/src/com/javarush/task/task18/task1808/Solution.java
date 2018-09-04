package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = reader.readLine(), fileNameOut1 = reader.readLine(), fileNameOut2 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileNameIn);
        int count = inputStream.available();
        byte[] buf3 = new byte[count/2];
        byte[] buf2 = new byte[count-buf3.length];
        inputStream.read(buf2);
        inputStream.read(buf3);
        inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(fileNameOut1);
        outputStream.write(buf2);
        outputStream.close();
        outputStream = new FileOutputStream(fileNameOut2);
        outputStream.write(buf3);
        outputStream.close();
    }
}
