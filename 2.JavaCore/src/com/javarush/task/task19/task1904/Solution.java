package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String[] strPerson = fileScanner.nextLine().split(" ");
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            String strDate = strPerson[3] + " " + strPerson[4] + " " + strPerson[5];
            try {
                date = simpleDateFormat.parse(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(strPerson[1], strPerson[2], strPerson[0], date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
