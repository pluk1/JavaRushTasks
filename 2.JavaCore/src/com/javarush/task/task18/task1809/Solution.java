package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(file1);

        int count = inputStream.available();
        byte[] buf = new byte[count];
        inputStream.read(buf);

        FileOutputStream outputStream = new FileOutputStream(file2);


        for (int i = buf.length -1; i >=0; i--) {

            outputStream.write(buf[i]);

        }

        inputStream.close();
        outputStream.close();

    }
}
