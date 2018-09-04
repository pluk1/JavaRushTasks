package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    public static String fileName;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {

        super(fileName);

        String[] strArr = fileName.split("\\.");
        if (strArr[strArr.length-1].equals("txt")) {

        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }

    }

    public static void main(String[] args) {


    }
}

