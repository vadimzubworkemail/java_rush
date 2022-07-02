package ru.javarush.tasks.level11;

/*
Класс Calculator
*/

public class Task0612 {
    public static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static double division(int a, int b) {
        double result = ((a * 1.0) / b);
        return result;
    }

    public static double percent(int a, int b) {
        double result = (a * b * 1.0) / 100;
        return result;
    }

    public static void main(String[] args) {

    }
}
