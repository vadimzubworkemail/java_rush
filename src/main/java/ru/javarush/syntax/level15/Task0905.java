package ru.javarush.syntax.level15;

/*
Метод возвращает результат – глубину его стек-трейса
*/

public class Task0905 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int count = Thread.currentThread().getStackTrace().length;
        System.out.println(count);
        return count;
    }
}
