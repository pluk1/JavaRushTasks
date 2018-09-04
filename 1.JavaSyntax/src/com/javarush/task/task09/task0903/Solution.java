package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        int lineNum=0;
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();

        for (int i = 0; i < 3; i++) {

            lineNum = stackTraceElements[i].getLineNumber();
        }

        return  /*напишите тут ваш код*/ lineNum;
    }

    public static int method2() {
        method3();
        int lineNum=0;
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();

        for (int i = 0; i < 3; i++) {

            lineNum = stackTraceElements[i].getLineNumber();
        }

        return  /*напишите тут ваш код*/ lineNum;
    }

    public static int method3() {
        method4();
        int lineNum=0;
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();

        for (int i = 0; i < 3; i++) {

            lineNum = stackTraceElements[i].getLineNumber();
        }

        return  /*напишите тут ваш код*/ lineNum;
    }

    public static int method4() {
        method5();
        int lineNum=0;
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();

        for (int i = 0; i < 3; i++) {

            lineNum = stackTraceElements[i].getLineNumber();
        }

        return  /*напишите тут ваш код*/ lineNum;
    }

    public static int method5() {
        int lineNum=0;
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();

        for (int i = 0; i < 3; i++) {

            lineNum = stackTraceElements[i].getLineNumber();
        }

        return  /*напишите тут ваш код*/ lineNum;
    }
}
