package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));


        while (true) {
            String data = reader.readLine();
            if (data.equals("exit")) {
                bufferedWriter.write(data + "\n");
                break;
            } else bufferedWriter.write(data+ "\n");

        }


        reader.close();
        bufferedWriter.close();
    }


}
