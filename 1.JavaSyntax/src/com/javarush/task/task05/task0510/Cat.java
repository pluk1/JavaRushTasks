package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код

    String name;
    int weight;
    int age;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.weight = 3;
        this.age =2;
        this.color = "Green";
        this.address = null;

    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Green";
        this.address = null;


    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "Green";
        this.address = null;

    }
    public void initialize(int weight, String color){
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.age = 3;

    }
    public void initialize(int weight, String color, String  address){
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;

    }

    public static void main(String[] args) {

    }
}
