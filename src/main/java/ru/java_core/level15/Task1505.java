package ru.java_core.level15;

public class Task1505 {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Cat";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}
