package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;


        while (true) {
            key = reader.readLine();
            if (key.equalsIgnoreCase("user")) {
                person = new Person.User();
                doWork(person);

            } else if (key.equalsIgnoreCase("loser")) {
                person = new Person.Loser();
                doWork(person);


            } else if (key.equalsIgnoreCase("coder")) {
                person = new Person.Coder();
                doWork(person);


            } else if (key.equalsIgnoreCase("proger")) {

                person = new Person.Proger();
                doWork(person);

            } else break;
        }

    }

    public static void doWork(Person person) {

        if (person instanceof Person.User){
             ((Person.User) person).live();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
