package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[3];

            arr[4] = 2;

        }catch (Exception e){
            exceptions.add(e);
        }

        try  {
            FileInputStream fis = null;
            fis = new FileInputStream("B:/myfile.txt");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] p =  new int[-2];
            p[-3]=5;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException();
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new IndexOutOfBoundsException();
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new Exception();
        } catch (Exception e){
            exceptions.add(e);
        }

    }
}
