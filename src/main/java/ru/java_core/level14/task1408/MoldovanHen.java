package ru.java_core.level14.task1408;

public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ��� ������ - " + Country.MOLDOVA + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
