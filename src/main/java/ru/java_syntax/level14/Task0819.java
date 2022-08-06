package ru.java_syntax.level14;

import java.util.HashSet;
import java.util.Set;

/*
Set из котов
*/

public class Task0819 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> copy = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            copy.add(new Cat());
        }
        return copy;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

    public static class Cat {

    }

}
