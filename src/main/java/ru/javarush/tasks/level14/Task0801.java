package ru.javarush.tasks.level14;

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
        for (String s : set){
            System.out.println(s);
        }
    }
}
