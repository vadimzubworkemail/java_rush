package ru.javarush.syntax.level14;

import java.util.HashMap;
import java.util.Map;

/*
Одинаковые имя и фамилия
*/

public class Task0815 {
    public static Map<String, String> createMap() {
        final Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Иванов", "Иван");
        stringMap.put("Петров", "Андрей");
        stringMap.put("Сидоров", "Костя");
        stringMap.put("Пупкин", "Вася");
        stringMap.put("Васильев", "Саша");
        stringMap.put("Макаревич", "Андрей");
        stringMap.put("Кутиков", "Саша");
        stringMap.put("Кинчев", "Костя");
        stringMap.put("Шевчук", "Юра");
        stringMap.put("Иванова", "Петра");
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countSameName = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name)) {
                countSameName++;
            }
        }
        return countSameName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;
        for (String last_Name : map.keySet()) {
            if (last_Name.equals(lastName)) {
                countLastName++;
            }
        }
        return countLastName;
    }

    public static void main(String[] args) {

    }
}
