package ru.javarush.syntax.level14;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция Map из котов
*/

public class Task0803 {
    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        map.forEach((s, cat) -> System.out.println(s + " : " + cat));
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        final Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
