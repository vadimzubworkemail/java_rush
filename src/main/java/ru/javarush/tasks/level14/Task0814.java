package ru.javarush.tasks.level14;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/

public class Task0814 {
    public static Set<Integer> createSet() {
        final Set<Integer> integers = new HashSet<>();
        integers.add(54);
        integers.add(21);
        integers.add(32);
        integers.add(2);
        integers.add(7);
        integers.add(51);
        integers.add(95);
        integers.add(5);
        integers.add(3);
        integers.add(1);
        integers.add(9);
        integers.add(74);
        integers.add(43);
        integers.add(71);
        integers.add(92);
        integers.add(12);
        integers.add(13);
        integers.add(88);
        integers.add(55);
        integers.add(44);
        return integers;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        final Set<Integer> copy = new HashSet<>(set);
        copy.removeIf(integer -> integer > 10);
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());
        System.out.println();
    }
}
