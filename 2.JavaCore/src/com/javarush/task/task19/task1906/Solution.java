package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filename = bufferedReader.readLine();
        String filenameOut = bufferedReader.readLine();
        bufferedReader.close();

        //String filename = "/Users/cartman/Documents/text.txt";

       // String filenameOut = "/Users/cartman/Documents/text1.txt";

        FileReader fileReader = new FileReader(filename);
        FileWriter fileWriter = new FileWriter(filenameOut);

        ArrayList<Integer> fileArr = new ArrayList<>();

        while (fileReader.ready()){
            fileArr.add(fileReader.read());
        }

        for (int i = 0; i < fileArr.size(); i++) {

            if (i == 0){

            } else if (i%2!=0){
                fileWriter.write(fileArr.get(i));
            }
        }

        fileReader.close();
        fileWriter.close();




    }
}
