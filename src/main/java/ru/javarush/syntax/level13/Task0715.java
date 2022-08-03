package ru.javarush.syntax.level13;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Task0715 {
    public static void main(String[] args) {
        final ArrayList<String> arrayList = new ArrayList<>();
        String word = "именно";
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");
        for (int i = 1; i <= arrayList.size(); i++) {
            arrayList.add(i++, word);
        }
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
