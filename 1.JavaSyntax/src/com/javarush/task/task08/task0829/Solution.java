package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }

        HashMap<String, String> home = new HashMap<>();

        while (true){

            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            home.put(city,family);

        }

        String req = reader.readLine();

        for (HashMap.Entry<String, String> entry : home.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (req.equals(key)){
                System.out.println(value);
            }

        }


//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
