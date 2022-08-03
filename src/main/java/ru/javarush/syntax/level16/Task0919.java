package ru.javarush.syntax.level16;

/*
Деление на ноль
*/

public class Task0919 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void divideByZero() throws ArithmeticException {
        int i = 10 / 0;
        System.out.println(i);
    }
}
