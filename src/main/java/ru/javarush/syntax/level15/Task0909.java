package ru.javarush.syntax.level15;

/*
Исключение при работе с массивами
*/

public class Task0909 {

    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

