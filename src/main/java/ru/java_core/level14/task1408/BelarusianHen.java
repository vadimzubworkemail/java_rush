package ru.java_core.level14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ћо€ страна - " + Country.BELARUS + ". я несу " + getCountOfEggsPerMonth() + " €иц в мес€ц.";
    }
}
