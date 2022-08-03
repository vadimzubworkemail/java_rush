package ru.javarush.syntax.level14;

import java.util.HashMap;
import java.util.Map;

/*
Налоговая и зарплаты
*/

public class Task0818 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 500);
        map.put("Петров", 600);
        map.put("Сидоров", 300);
        map.put("Пупкин", 400);
        map.put("Кузин", 350);
        map.put("Федин", 370);
        map.put("Вякин", 340);
        map.put("Мукин", 290);
        map.put("Шмякин", 200);
        map.put("Выкин", 499);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            int salary = pair.getValue();
            if (salary < 500) {
                map.remove(pair.getKey());
            }
        }
//        System.out.println(map);
    }

    public static void main(String[] args) {
//        removeItemFromMap(createMap());
    }
}
