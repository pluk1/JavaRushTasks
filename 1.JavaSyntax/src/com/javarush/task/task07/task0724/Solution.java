package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human father1 = new Human("father1", true,55);
        Human mother1 = new Human("mother1", false,47);
        Human father2 = new Human("father2", true,55);
        Human mother2 = new Human("mother2", false,47);

        Human human1 = new Human("human1",true,24, father1, mother1);
        Human human2 = new Human("human2",true,24, father2, mother2);
        Human human3 = new Human("human3",true,24, father1, mother1);
        Human human4 = new Human("human4",true,24, father2, mother2);
        Human human5 = new Human("human5",true,24, father1, mother1);



        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(father2);
        System.out.println(mother2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















