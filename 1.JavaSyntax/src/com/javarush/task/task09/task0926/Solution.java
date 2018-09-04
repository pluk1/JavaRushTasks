package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код


        ArrayList<int[]> intArray = new ArrayList<>();

        int[] arr5 = {1,2,3,4,5};
        int[] arr2 = {1,2};
        int[] arr4 = {1,2,3,4};
        int[] arr7 = {1,2,3,4,5,6,7};
        int[] arr0 = {};


        intArray.add(arr5);
        intArray.add(arr2);
        intArray.add(arr4);
        intArray.add(arr7);
        intArray.add(arr0);



        return intArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
