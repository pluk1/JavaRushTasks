package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    public static BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));


    static {
        try {
            firstFileName = reader1.readLine();
            secondFileName = reader1.readLine();
            reader1.close();
        } catch (IOException e) {

            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String content = "";
        String fullFileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            return content;
        }
//
//        @Override
//        public void join() throws InterruptedException {
//
//        }

        @Override
        public void start() {

            run();

        }

        @Override
        public void run() {


            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));                // создаем reader типа буфера новый буфер для чтения
                // (из нового файла для чтения(с новым файлом (имя которого)))
                while (fileReader.ready()) // пока в reader'е есть что читать
                {
                    content += fileReader.readLine() + " "; // дописываем строку к filecontent и + пробел
                }
                fileReader.close(); // закрываем этот ридер
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
