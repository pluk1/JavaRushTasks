package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader flNameReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = flNameReader.readLine();
        String fileName2 = flNameReader.readLine();
        flNameReader.close();

        BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2));

        while (bfReader.ready()){
            bfWriter.write(bfReader.readLine().replaceAll("[\\.]","!"));
        }

        bfReader.close();
        bfWriter.close();

    }
}
