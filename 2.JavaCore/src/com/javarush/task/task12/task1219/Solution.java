package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public interface Move {
        public void move();
    }

    public class Human implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Fly,Swim, Run{

        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public class Penguin implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements Move, Fly, Run{

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void run() {

        }
    }
}
