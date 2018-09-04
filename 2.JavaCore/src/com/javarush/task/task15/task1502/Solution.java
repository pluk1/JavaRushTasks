package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
1. Класс Goose должен быть создан внутри класса Solution и быть статическим.
2. Класс Dragon должен быть создан внутри класса Solution и быть статическим.
3. Класс Goose должен быть потомком класса SmallAnimal.
4. Класс Dragon должен быть потомком класса BigAnimal.
5. В классе Goose должен быть переопределен метод getSize, который должен возвращать строку формата
 "Гусь маленький, " + [getSize родительского класса].
6. В классе Dragon должен быть переопределен метод getSize, который должен возвращать строку формата
 "Дракон большой, " + [getSize родительского класса].
7. Область видимости переопределенных методов getSize в классах Goose и Dragon должна быть расширена до максимальной.
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal{
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal{

        @Override
        public String getSize() {
            return "Дракон большой, "+ super.getSize();
        }
    }

}
