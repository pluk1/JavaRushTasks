package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
       private String name;
        private String lastName;
        private int age;
        private float hight;
        private float weight;
        private boolean sex;


        public Human(String name, String lastName, int age, float hight, float weight, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.hight = hight;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(float hight) {
            this.hight = hight;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }


        public Human(String name, float hight) {
            this.name = name;
            this.hight = hight;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }


        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, float hight) {
            this.name = name;
            this.lastName = lastName;
            this.hight = hight;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public float getHight() {
            return hight;
        }

        public float getWeight() {
            return weight;
        }

        public boolean isSex() {
            return sex;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHight(float hight) {
            this.hight = hight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }
    }
}
