package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{

        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        System.out.println(outputStream.toString());

        FileOutputStream fileOutputStream = new FileOutputStream(readerFileName.readLine());

        fileOutputStream.write(outputStream.toByteArray());


        fileOutputStream.close();
        readerFileName.close();




//        PrintWriter printWriter = new PrintWriter(new FileWriter(readerFileName.readLine()));
//
//        printWriter.print(outputStream.toString());
//
//        printWriter.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

