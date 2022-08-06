package ru.java_syntax.level15;

/*
Создаем свои исключения
*/

public class Task0918 {
    public static void main(String[] args) {
    }

    static class MyException extends Exception {

    }

    static class MyException2 extends Throwable {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}
