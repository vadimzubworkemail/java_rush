package ru.java_core.level14.task1408;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - " + Country.UKRAINE + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
