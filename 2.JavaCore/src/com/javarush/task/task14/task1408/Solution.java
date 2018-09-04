package com.javarush.task.task14.task1408;

/* 
Куриная фабрика

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
7. В каждом из четырех последних классов написать свою реализацию метода getDescription.

Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9. Все созданные вами классы должны быть в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
        System.out.println(hen.getDescription());
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            Hen hen;
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    return hen;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    return hen;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    return hen;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    return hen;
            }

            return null;
        }
    }


}

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}