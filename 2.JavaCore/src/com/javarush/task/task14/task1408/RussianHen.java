package com.javarush.task.task14.task1408;

class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    String getDescription() {

        return "Я - курица. Моя страна - " + Country.RUSSIA
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
