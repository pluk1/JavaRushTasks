package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (anotherCat.strength > this.strength){
            return  true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "cat1";
        cat1.age = 3;
        cat1.weight = 5;
        cat1.strength = 3;

        cat2.name = "cat2";
        cat2.age = 5;
        cat2.weight = 6;
        cat2.strength = 4;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}
