package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileNameReader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        load(inputStream);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        properties.forEach(p::setProperty);
        p.store(outputStream, null);
        outputStream.close();

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод\
        Properties p = new Properties();
        p.load(inputStream);
        p.forEach((k,v) -> properties.put(String.valueOf(k),String.valueOf(v)));
        inputStream.close();

    }

    public static void main(String[] args) {

    }
}
