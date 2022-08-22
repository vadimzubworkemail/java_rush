package ru.java_core.level14.task1417;

public class USD extends Money{
        private double amount;

    public USD(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
