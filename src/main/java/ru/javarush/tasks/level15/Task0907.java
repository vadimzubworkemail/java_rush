package ru.javarush.tasks.level15;

/*
Исключение при работе с числами
*/

public class Task0907 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

