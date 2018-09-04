package com.javarush.task.task14.task1413;

/* 
Computer
1. Интерфейс CompItem должен существовать в отдельном файле.
2. В интерфейсе CompItem должен быть объявлен метод getName() с типом возвращаемого значения String и без параметров.
3. Классы Keyboard, Monitor и Mouse должны реализовывать интерфейс CompItem, а также существовать в отдельных файлах.
4. Метод getName в классах реализующих интерфейс CompItem должен возвращать простое имя класса, например
"Keyboard" для класса Keyboard.
5. Класс Computer должен содержать по одному приватному полю типа Keyboard, Mouse, Monitor, а также существовать
 в отдельном файле.
6. Конструктор класса Computer должен принимать 3 параметра(keyboard, mouse, monitor) и корректно инициализировать
соответствующие поля класса.
7. Для полей keyboard, mouse и monitor Computer должны быть созданы геттеры(getKeyboard, getMouse, getMonitor),
которые будут возвращать соответствующие поля класса Computer.
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
