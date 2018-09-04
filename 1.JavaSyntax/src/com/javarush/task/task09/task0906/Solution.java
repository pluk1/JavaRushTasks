package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        String main = null;
        for (int i = 0; i < 3; i++) {
         main = stackTraceElement[i].getMethodName();
        }

        System.out.println(stackTraceElement[2].getClassName()+": "+ main+": " + s);
    }
}
