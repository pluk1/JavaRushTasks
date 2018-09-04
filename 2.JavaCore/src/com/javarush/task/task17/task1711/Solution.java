package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        String name;
        Sex sex;
        Date bd;
        Person p;
        int id;


        switch (args[0]) {

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        try {
                            id = Integer.parseInt(args[i]);
                            name = args[i + 1];
                            sex = args[i + 2] == "м" ? Sex.MALE : Sex.FEMALE;
                            bd = format.parse(args[i + 3]);
                            Person person = allPeople.get(id);
                            person.setName(name);
                            person.setSex(sex);
                            person.setBirthDay(bd);

                        } catch (Exception e) {
                        }
                    }
                }
                break;

            case "-c":
                //-c name1 sex1 bd1 name2 sex2 bd2
                synchronized (allPeople) {

                    try {
                        for (int i = 1; i < args.length; i += 3) {
                            name = args[i];
                            bd = format.parse(args[i + 2]);

                            if (args[i + 1] == "м") {
                                p = Person.createMale(name, bd);
                                allPeople.add(p);
                                System.out.println(allPeople.indexOf(p));
                            } else {
                                p = Person.createFemale(name, bd);
                                allPeople.add(p);
                                System.out.println(allPeople.indexOf(p));

                            }

                        }
                    } catch (Exception e) {

                    }

                }
                break;

            case "-d":
                //-d id1 id2 id3 id4
                synchronized (allPeople) {
                    try {
                        for (int i = 1; i < args.length; i++) {
                            p = allPeople.get(Integer.parseInt(args[i]));
                            p.setBirthDay(null);
                            p.setName(null);
                            p.setSex(null);

                        }
                    } catch (Exception e) {

                    }
                }
                break;

            case "-i":
                //-i id1 id2 id3 id4
                synchronized (allPeople) {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        for (int i = 1; i < args.length; i++) {

                            p = allPeople.get(i - 1);
                            // System.out.println(allPeople.get(i-1));
                            String getSex = p.getSex() == Sex.MALE ? "м" : "ж";

                            System.out.println(p.getName() + " " + getSex + " " + dateFormat.format(p.getBirthDay()));
                        }


                    } catch (Exception e) {

                    }
                }
                break;
        }


    }
}
