package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dateIn = reader.readLine();

        SimpleDateFormat oldDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.getDefault());

        Date date = oldDateFormat.parse(dateIn);
        String result = newDateFormat.format(date);

        System.out.println(result.toUpperCase());
    }
}
