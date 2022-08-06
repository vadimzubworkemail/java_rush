package ru.java_syntax.level14;

import java.util.HashMap;
import java.util.Map;

/*
Удалить людей, имеющих одинаковые имена
*/

public class Task0817 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Сергей");
        map.put("Петров", "Васлилий");
        map.put("Васильев", "Александр");
        map.put("Кузнецов", "Александр");
        map.put("Бодян", "Мотя");
        map.put("Попеску", "Ион");
        map.put("Василюк", "Богдан");
        map.put("Кривоносов", "Сергей");
        map.put("Маркитан", "Вова");
        map.put("Занозов", "Вова");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> hashMap = new HashMap<>(map);
        for (String name : hashMap.values()) {
            int count = 0;
            for (String mapName : map.values()) {
                if (name.equals(mapName)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
