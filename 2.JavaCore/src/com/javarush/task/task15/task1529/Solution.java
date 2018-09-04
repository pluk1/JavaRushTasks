package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.clear();
    }
    
    static {
        //add your code here - добавьте код тут

        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader readStr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readSeats = new BufferedReader(new InputStreamReader(System.in));
        String getStr = readStr.readLine();
        if (getStr.equals("helicopter")){
            result = new Helicopter();
        } else if(getStr.equals("plane")){
            int seats = Integer.parseInt(readSeats.readLine());
            result = new Plane(seats);
        }
        readSeats.close();
        readStr.close();

    }
}
