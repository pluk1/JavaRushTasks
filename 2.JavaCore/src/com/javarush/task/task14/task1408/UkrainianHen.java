package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }

    String getDescription() {

        return "Я - курица. Моя страна - " + Country.UKRAINE
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}