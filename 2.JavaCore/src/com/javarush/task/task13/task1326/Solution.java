package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        FileInputStream inputStream = new FileInputStream(reader.readLine());
//
//
//        BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream));
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayListSorted = new ArrayList<>();
//
//    Integer data;
//
////    /Users/cartman/Documents/text.txt
//
//        try{
//            while (fileReader.ready()){
//
//                System.out.println(fileReader.readLine());
//                data = Integer.parseInt(fileReader.readLine());
//                arrayList.add(data);
//
//            }
//        }catch (Exception e){
//            fileReader.close();
//        }
//
//
//        for (Integer number : arrayList
//                ) {
//            if (number%2 == 0){
//                arrayListSorted.add(number);
//            }
//        }
//
//        Collections.sort(arrayListSorted);
//
//        for (Integer num: arrayListSorted
//             ) {
//            System.out.println(num);
//
//        }
//        inputStream.close();
//        fileReader.close();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (fileReader.ready()){
                int i = Integer.parseInt(fileReader.readLine());
                if (i % 2 == 0)
                    list.add(i);
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}
