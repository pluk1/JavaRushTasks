package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        File path = new File(root);

        List<String> fileList = new ArrayList<>();

        for (File file : path.listFiles()
        ) {
            if (file.isDirectory()){

                File inDir = new File(file.getAbsolutePath());

                for (File file1 : inDir.listFiles()
                ) {
                    fileList.add(inDir.getAbsolutePath());

                }
            }
            fileList.add(file.getAbsolutePath());
        }
        return fileList;

    }

    public static void main(String[] args) {
        
    }
}
