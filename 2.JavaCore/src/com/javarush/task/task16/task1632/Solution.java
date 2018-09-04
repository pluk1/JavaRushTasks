package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(0, new Thread0());
        threads.add(1, new Thread1());
        threads.add(2, new Thread2());
        threads.add(3, new Thread3());
        threads.add(4, new Thread4());


    }

    public static void main(String[] args) throws InterruptedException {

        threads.get(0).start();
        threads.get(1).start();




    }


    public static class Thread0 extends Thread {

        @Override
        public void run() {

            while (true) {

            }
        }
    }

    public static class Thread1 extends Thread {

        @Override
        public void run() {

            if (currentThread().isInterrupted()) {
                System.out.println(new InterruptedException());
            }

        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {

            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread3 extends Thread implements Message {
        private boolean isCancel = false;
        @Override
        public void showWarning() {
            this.isCancel = true;
        }

        @Override
        public void run() {
            while (!isCancel){}
        }
    }

    public static class Thread4 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run() {
            int res = 0;
            while (true) {
                try {
                    String str = reader.readLine();

                    if (!str.equals("N")) {
                        try {
                            res += Integer.parseInt(str);
                        } catch (NumberFormatException e) {
                            res += 0;
                        }

                    } else {
                        System.out.println(res);

                        return;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }

}