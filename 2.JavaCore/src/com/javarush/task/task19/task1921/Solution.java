package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

//        String fileName = args[0];

        String fileName = "/Users/cartman/Documents/text1.txt";

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        // Pattern p = Pattern.compile("\\D{2,}");


        while (br.ready()) {

            String[] strings = br.readLine().split("\\D{2,}");

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");

            System.out.println(strings[0] + "#     "+strings[1]);
            Date date = simpleDateFormat.parse(strings[1]);

            PEOPLE.add(new Person(strings[0], date));

        }

        fr.close();
        br.close();
    }
}
