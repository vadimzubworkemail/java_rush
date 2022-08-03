package ru.javarush.syntax.level16;

import java.util.ArrayList;
import java.util.Arrays;

/*
Список из массивов чисел
*/

public class Task0926 {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        final ArrayList<int[]> ints = new ArrayList<>();
        ints.add(new int[]{1, 2, 3, 4, 5});
        ints.add(new int[]{22, 33});
        ints.add(new int[]{4, 0, 4, 2});
        ints.add(new int[]{7, 8, 9, 10, 11, 12, 13});
        ints.add(new int[]{});
        return ints;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}
