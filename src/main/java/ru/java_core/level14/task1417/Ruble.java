package ru.java_core.level14.task1417;

public class Ruble extends Money{
    private double amount;

    public Ruble(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
