package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader flNameReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = flNameReader.readLine();
        String fileName2 = flNameReader.readLine();

//        String fileName1 = "/Users/cartman/Documents/text.txt";
//        String fileName2 = "/Users/cartman/Documents/text1.txt";

        flNameReader.close();

        BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2));

       // BufferedReader bfReader1 = new BufferedReader(new FileReader(fileName2));


        while (bfReader.ready()) {

            bfWriter.write(bfReader.readLine().replaceAll("\\p{Punct}", ""));
            //System.out.println(bfReader1.readLine());
        }

        bfReader.close();
        bfWriter.close();

    }
}
