package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String inStr = outputStream.toString();

        System.setOut(consoleStream);

        String[] strArr = inStr.split(" ");

        int res = 0;

        switch (strArr[1]) {
            case "+":
                res = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
                break;

            case "*":
                res = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
                break;

            case "-":
                res = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
                break;
        }

        System.out.println(strArr[0] + " " + strArr[1] + " " + strArr[2] + " " + strArr[3] + " " + res);

//        Arrays.stream(strArr).forEach(s -> System.out.println(s));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

