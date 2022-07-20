package ru.javarush.tasks.level15;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class Task0911 {

    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
