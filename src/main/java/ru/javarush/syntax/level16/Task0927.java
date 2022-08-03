package ru.javarush.syntax.level16;

import java.util.*;

/*
Десять котов
*/

public class Task0927 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        final HashMap<String, Cat> catHashMap = new HashMap<>();
        catHashMap.put("Васяка", new Cat("Васяка"));
        catHashMap.put("Рыжик", new Cat("Рыжик"));
        catHashMap.put("Пушок", new Cat("Пушок"));
        catHashMap.put("Муся", new Cat("Муся"));
        catHashMap.put("Пыжик", new Cat("Пыжик"));
        catHashMap.put("Чижик", new Cat("Чижик"));
        catHashMap.put("Мурзик", new Cat("Мурзик"));
        catHashMap.put("Полосатик", new Cat("Полосатик"));
        catHashMap.put("Мурка", new Cat("Мурка"));
        catHashMap.put("Шурка", new Cat("Шурка"));
        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
