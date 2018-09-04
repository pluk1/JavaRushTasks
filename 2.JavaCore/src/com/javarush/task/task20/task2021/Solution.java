package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public Solution() {
    }

    public static class SubSolution extends Solution {
        public SubSolution() {
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            throw  new  NotSerializableException("ssdf");

        }

        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{

            throw new  NotSerializableException("ssdf");

        }
    }

    public static void main(String[] args) {

    }
}
