package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {

//        File path = new File("/Users/cartman/Documents/");
//        File resultFileAbsolutePath = new File("/Users/cartman/Documents/resultFil.txt");

        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);

        List<File> listFiles = Arrays.asList(Objects.requireNonNull(path.listFiles()));

        List<File> filesMoreThan50 = new ArrayList<>();

        for (File file : listFiles) {
            if (file.length() <= 50L) {
                filesMoreThan50.add(file);
            }
        }

        filesMoreThan50.forEach(f -> System.out.println(f.getName()));

        Collections.sort(filesMoreThan50);

        File allFilesContent = new File(path.getAbsolutePath() + "allFilesContent.txt");

//        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        resultFileAbsolutePath.renameTo(allFilesContent);


        FileWriter fileWriter = new FileWriter(allFilesContent, true);

        for (File file : filesMoreThan50
        ) {
            FileReader fileReader = new FileReader(file);
            while (fileReader.ready()) {
                fileWriter.write(fileReader.read());
            }
            fileWriter.write("\n");
            fileReader.close();
        }

        fileWriter.flush();
        fileWriter.close();
    }
}
