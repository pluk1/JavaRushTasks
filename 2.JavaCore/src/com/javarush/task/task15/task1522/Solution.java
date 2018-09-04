package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readKeyFromConsoleAndInitPlanet();


    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = reader.readLine();

        if (planet.equals(thePlanet.SUN)) {
            thePlanet = Sun.getInstance();

        } else if (planet.equals(thePlanet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (planet.equals(thePlanet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }

    }


}


