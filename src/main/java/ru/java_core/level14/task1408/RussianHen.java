package ru.java_core.level14.task1408;

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - " + Country.RUSSIA + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
