package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int score=0;
        int res=0;
        do{
            String numberS = reader.readLine();
            number = Integer.parseInt(numberS);
            if (number == -1){
                number = 0;
                score++;
                res = res + number;
                break;
            }
            score++;
            res = res + number;
        } while (number != -1);

        double result;
        score = score -1;
        result= (double) res / score;

        System.out.printf("%.1f \n",result);

    }
}

