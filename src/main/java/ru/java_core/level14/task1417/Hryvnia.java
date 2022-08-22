package ru.java_core.level14.task1417;

public class Hryvnia extends Money{
    private double amount;

    public Hryvnia(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
