package com.javarush.task.task08.task0824;

/* 
Собираем семейство
два дедушки, две бабушки, отец, мать, трое детей.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код



        Human child1 = new Human();
        child1.age = 11;
        child1.name = "child1";
        child1.sex = true;
        child1.children = new ArrayList<Human>();


        Human child2 = new Human();
        child2.age = 7;
        child2.name = "child2";
        child2.sex = true;
        child2.children = new ArrayList<Human>();


        Human child3 = new Human();
        child3.age = 12;
        child3.name = "child3";
        child3.sex = true;
        child3.children = new ArrayList<Human>();

        Human father = new Human();
        father.name = "father";
        father.age = 44;
        father.sex = true;
        father.children = new ArrayList<Human>();
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "mother";
        mother.age = 44;
        mother.sex = false;
        mother.children = new ArrayList<Human>();
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human gran1 = new Human();
        gran1.name = "gran1";
        gran1.sex = true;
        gran1.age = 76;
        gran1.children = new ArrayList<Human>();
        gran1.children.add(father);

        Human granM1 = new Human();
        granM1.name = "granM1";
        granM1.sex = false;
        granM1.age = 76;
        granM1.children = new ArrayList<Human>();
        granM1.children.add(father);

        Human gran2 = new Human();
        gran2.name = "gran2";
        gran2.sex = true;
        gran2.age = 76;
        gran2.children = new ArrayList<Human>();
        gran2.children.add(mother);

        Human granM2 = new Human();
        granM2.name = "granM2";
        granM2.sex = false;
        granM2.age = 76;
        granM2.children = new ArrayList<Human>();
        granM2.children.add(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(gran1);
        System.out.println(gran2);
        System.out.println(granM1);
        System.out.println(granM2);
        System.out.println(father);
        System.out.println(mother);




    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
