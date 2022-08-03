package ru.javarush.syntax.level15;

/*
Исключение при работе с коллекциями List
*/

import java.util.ArrayList;

public class Task0910 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
