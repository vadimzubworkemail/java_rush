package ru.java_syntax.level13;

import java.util.ArrayList;

/*
Р или Л
*/

public class Task0716 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String r = "р";
        String l = "л";
        ArrayList<String> list = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(r) && !str.contains(l)) {
                continue;
            }
            if (str.contains(l) && !str.contains(r)) {
                list.add(str);
            }
            list.add(str);
        }
        return list;
    }
}
