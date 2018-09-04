package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        String[] words = s.split(" +"); // split переводит нашу строку s в массив слов words
                // " " - означает, что слово заканчивается на пробел, " +" - пробелов может идти несколько подряд
        // Вывод на экран
        char space = ' ';
        for(String subStr:words) {
//            word.substring(0, 1) — возвращает первую букву в слове
//            word.substring(0, 1).toUpperCase() — переводит первую букву в верхний регистр
//            word.substring(1) — добавляет остальные символы без изменения


            if (subStr.length()!=0)
            System.out.print(subStr.substring(0, 1).toUpperCase() + subStr.substring(1) + " ");
// ss.substring(0, 1) - берем первую букву слова ss и .toUpperCase() - меняем ее на заглавную
// ss.substring(1) + " " - добавляем остальные буквы начиная со второй, добавляем пробел
// таким образом, мы "починили" нашу строку выкинув из нее все лишние пробелы.

        }

//        char[] chArray = s.toCharArray();
//        //перебираем все элементы массива
//        for(int i = 0; i<chArray.length; i++){
//            //находим пробел
//            if(chArray[i] == ' '){
//                //заменяем на точку
//                char temp = chArray[i+1];
//
//            }
//        }
//        System.out.println(chArray);
    }
}
