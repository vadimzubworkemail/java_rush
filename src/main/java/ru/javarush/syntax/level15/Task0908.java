package ru.javarush.syntax.level15;

/*
Исключение при работе со строками
*/

public class Task0908 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
