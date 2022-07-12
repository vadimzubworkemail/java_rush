package ru.javarush.tasks.level14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
10 тысяч удалений и вставок
*/
public class Task0808 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(0);
        }

    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(0, new Object());
        }

    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }

    }
}
