package ru.javarush.syntax.level12;

import java.util.ArrayList;

public class ArrayListInit {
    public static ArrayList<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("Hello");
        list.add("Java");
        list.add("Rush");
        System.out.println(list.size());
        System.out.println(list.size());
//        Правильное решение

//        for (String string : list) {
//            System.out.println(string);
//        }
        for (int i = list.size(); i > 0; i--) {
            int j = ArrayListInit.list.size() - i;
            System.out.println(list.get(j));
        }
    }
}
