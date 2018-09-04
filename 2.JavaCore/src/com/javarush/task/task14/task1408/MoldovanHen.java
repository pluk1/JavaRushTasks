package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen implements Country {

    @Override
    int getCountOfEggsPerMonth() {
        return 6;
    }

    String getDescription() {

        return "Я - курица. Моя страна - " + Country.MOLDOVA
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
