package ru.java_syntax.level14;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Task0821 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Пупкин", "Вася");
        map.put("Васлильев", "Пупа");
        map.put("Ванин", "Иван");
        map.put("Иванов", "Вася");
        map.put("Петров", "Петя");
        map.put("Сидоров", "Иван");
        map.put("Пупкин", "Саша");
        map.put("Петрова", "Маша");
        map.put("Сидророва", "Глаша");
        map.put("Пупкина", "Маша");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
