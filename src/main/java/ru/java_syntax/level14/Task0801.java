package ru.java_syntax.level14;

import java.util.HashSet;
import java.util.Set;

/*
Set из растений
*/

public class Task0801 {
    public static void main(String[] args) {
        final Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        set.forEach(s -> System.out.print(s + " "));
        System.out.println();

        set.removeIf(s -> s.contains("а"));

        set.forEach(s -> System.out.print(s + " "));
    }
}
