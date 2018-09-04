package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* 
Транзакционность
*/
//      /Users/cartman/Documents/text.txt


public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader allLinesFilename = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader forRemoveLinesFileName = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader allLinesfileReader = new BufferedReader(new InputStreamReader(new FileInputStream(allLinesFilename.readLine())));

        while (allLinesfileReader.ready()) // пока в reader'е есть что читать
        {
            allLines.add(allLinesfileReader.readLine());
        }
        allLinesfileReader.close();

        BufferedReader forRemoveLinesfileReader = new BufferedReader(new InputStreamReader(new FileInputStream(forRemoveLinesFileName.readLine())));

        while (forRemoveLinesfileReader.ready()) // пока в reader'е есть что читать
        {
            forRemoveLines.add(forRemoveLinesfileReader.readLine());
        }
        forRemoveLinesfileReader.close();


        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {

        int count = 0;
        List<String> allLinesCopy = new ArrayList<String>(allLines);

//
//        for (int i = 0; i < allLines.size(); i++) {
//            for (int j = 0; j < forRemoveLines.size(); j++) {
//                if (allLines.get(i).equals(forRemoveLines.get(j))) {
//
//                    allLines.remove(i);
//                    count++;
//                }
//            }
//        }
//        if (count == allLines.size()) {
//            allLines.clear();
//            throw new CorruptedDataException();
//        } else {
//            allLines = allLinesCopy;
//        }

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
