package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i, Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int number = arrayList.get(0);

        int temp = 1;


        for (int i = 1; i < arrayList.size(); i++) {

          if (arrayList.get(i) == number){
              count++;
          }

          if (number!=arrayList.get(i)){
              number = arrayList.get(i);
              if (count > temp){
                  temp = count;
              }
              count = 1;

          }
        }

        if (count > temp){
            System.out.println(count);
            } else System.out.println(temp);


    }
}