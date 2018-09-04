package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();


        ArrayList<Character> vowelArr = new ArrayList<>();
        ArrayList<Character> notVowelsArr = new ArrayList<>();


        String[] wordsArr = inputStr.split("\\s");


        for (int i = 0; i < wordsArr.length; i++) {

            for (int j = 0; j < wordsArr[i].length(); j++) {

                char tmpChar = wordsArr[i].charAt(j);

                if (isVowel(tmpChar)) {

                    vowelArr.add(tmpChar);

                } else if (isVowel(tmpChar) == false && tmpChar != ' ') {
                    notVowelsArr.add(tmpChar);
                }
            }

        }

        for (Character ch : vowelArr) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (Character ch : notVowelsArr) {
            System.out.print(ch + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}