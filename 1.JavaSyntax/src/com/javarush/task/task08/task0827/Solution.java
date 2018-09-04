package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
       // System.out.println(isDateOdd("MAY 1 2013"));
    isDateOdd("MAY 1 2013");
    }


    public static boolean isDateOdd(String date) throws ParseException {

//        String[] dateArr  = date.split(" +");
//
//        for (int i = 0; i < dateArr.length; i++) {
//            System.out.println(dateArr[i]);
//        }

//      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
//        LocalDate parDate = LocalDate.parse(date, formatter);

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);

        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date(date)); можно и без форматирования даты
        calendar.setTime(format.parse(date)); // с SimpleDateFormat более универсальное решение
    //    return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

        System.out.println(calendar);

        return true;
    }
}
