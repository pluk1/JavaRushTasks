package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек

дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granDadName = reader.readLine();
        Cat granDad = new Cat(granDadName);

        String granMomName = reader.readLine();
        Cat granMom = new Cat(granMomName);

        String dadName = reader.readLine();
        Cat dad = new Cat(dadName, granDad, false);

        String momName = reader.readLine();
        Cat mom = new Cat(momName, granMom, true);

        String sonNmae = reader.readLine();
        Cat son = new Cat(sonNmae, mom, dad, granMom, granDad);

        String dautNmae = reader.readLine();
        Cat daut = new Cat(dautNmae, mom, dad, granMom, granDad);


//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);


        System.out.println(granDad);
        System.out.println(granMom);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daut);
    }

    public static class Cat {
        private String name;
        private Cat granDad;
        private Cat granMom;
        private Cat mom;
        private Cat dad;
        private Cat parent;
        private boolean isGranMom;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, boolean isGranMom) {
            this.name = name;
            this.parent = parent;
            this.isGranMom = isGranMom;

        }



        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;

        }

        Cat(String name, Cat mom, Cat dad, Cat granMom, Cat granDad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
            this.granDad = granDad;
            this.granMom = granMom;

        }


        @Override
        public String toString() {

            if (parent!=null&&isGranMom==false) {

                return "Cat name is " + name + ", no mother, father is " + parent.name;

            } else if (parent!=null&&isGranMom==true) {

                return "Cat name is " + name + ", mother is " + parent.name + ", no father";

            } else if (dad != null)
                return "Cat name is " + name + ", mother is " + mom.name +
                        ", father is " + dad.name;
            else if (mom != null)


                return "Cat name is " + name + ", mother is " + mom.name +
                        ", father is " + dad.name;

            return "Cat name is " + name + ", no mother, no father";
        }

    }

    /* Cat name is дедушка Вася, no mother, no father
    Cat name is бабушка Мурка, no mother, no father
    Cat name is папа Котофей, no mother, father is дедушка Вася

    Cat name is мама Василиса, mother is бабушка Мурка, no father
    Cat name is мама Василиса, mother is бабушка Мурка, no father

    Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
    Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
*/
}
