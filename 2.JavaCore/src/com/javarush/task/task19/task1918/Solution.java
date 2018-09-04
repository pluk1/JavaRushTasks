package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Solution {

    public static void main(String[] args) throws IOException {
//        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = fileNameReader.readLine();
//        FileReader fr = new FileReader(fileName);
//        BufferedReader br = new BufferedReader(fr);
//
//        List<String> list = new ArrayList<>();
//
//        String tag1;
//        String tag2;
//
//        Pattern p1 = Pattern.compile("<\\w+");
//        Pattern p2 = Pattern.compile("</\\w+>?");
//
////        Pattern p = Pattern.compile("<(\"[^\"]*\"|'[^']*'|[^'\">])*>");
//
//
//        // while (br.ready()){
//
//        String code = br.readLine();
//
//
//        Matcher m1 = p1.matcher(code);
//        m1.find();
//        tag1 = m1.group();
//
//
//        Matcher m2 = p2.matcher(code);
//        m2.find();
//        tag2 = m2.group();
//
//
//        Pattern p = Pattern.compile(tag1 + ".*?" + tag2 + "?");
//        Matcher m = p.matcher(code);
//
//
//        while (m.find()) {
//            System.out.println(m.group());
//        }
//
//        //   }
//
//        // /Users/cartman/Documents/text1.txt
//
//
//        fileNameReader.close();
//        fr.close();
//        br.close();
//
//    }
//}
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));

        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null){
            sb.append(line);
        }
        reader.close();

        String openTag = "<"+args[0];
        String closeTag = "</"+args[0]+">";

        // ищем все открывающие тэги и запоминаем их индексы расположения в строке
        List<Integer> openList = new ArrayList<>();
        int startIndex = 0;
        int index;
        while (true) {
            index = sb.indexOf(openTag, startIndex);
            if (index == -1) break;
            openList.add(index);
            startIndex = index+1;
        }

        // ищем все закрывающие тэги и запоминаем их индексы расположения в строке
        List<Integer> closeList = new ArrayList<>();
        startIndex = 0;
        while (true) {
            index = sb.indexOf(closeTag, startIndex);
            if (index == -1) break;
            closeList.add(index);
            startIndex = index+1;
        }

        // берем первый openTag и идем до closeTag, считаю openTag-и по пути (уровень вложенности)
        int closeID, openID, level = 0;
        while (openList.size() != 0) {
            for (int i = 0; i < openList.size(); i++) {
                if (openList.get(i) < closeList.get(0)) level++;
                else break;
            }
            for (int i = level-1; i >= 0; i--) {
                openID = openList.get(0);
                closeID = closeList.get(i);
                line = sb.substring(openID, closeID);
                System.out.println(line+closeTag);
                openList.remove(0);
                closeList.remove(i);
                level = 0;
                break;
            }
        }
    }
}
