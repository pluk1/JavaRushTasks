package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);


    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //Напишите тут ваше решение

        Integer x = array[0];
        Integer y = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (x > array[i]) {

                x = array[i];
            }


            if (y < array[i]) {
                y = array[i];
            }

        }

        return new Pair<Integer, Integer>(x, y);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
