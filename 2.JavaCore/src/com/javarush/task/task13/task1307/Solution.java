package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    class StringObject implements SimpleObject//допишите здесь ваш код
    {
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}