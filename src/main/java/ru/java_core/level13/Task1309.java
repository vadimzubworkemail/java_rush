package ru.java_core.level13;

public class Task1309 {
    public static void main(String[] args) throws Exception {

    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }

}
