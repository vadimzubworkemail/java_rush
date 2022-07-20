package ru.javarush.tasks.level15;

/*
Логирование стек трейса
*/

public class Task0906 {

    public static void main(String[] args) {
        log("In method");
    }

    public static void log(String text) {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        String dateLog = className + ": " + methodName + ": " + text;
        System.out.println(dateLog);
    }
}
