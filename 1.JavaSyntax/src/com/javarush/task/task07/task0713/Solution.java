package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainArr = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            mainArr.add(Integer.parseInt(reader.readLine()));

        }

        for (int i = 0; i < mainArr.size(); i++) {
            if (mainArr.get(i) % 3 == 0) {
                array3.add(mainArr.get(i));
                if (mainArr.get(i)%2==0)
                    array2.add(mainArr.get(i));


            } else if (mainArr.get(i) % 2 == 0) {
                array2.add(mainArr.get(i));
            } else array.add(mainArr.get(i));

        }

        printList(array3);
        printList(array2);
        printList(array);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
