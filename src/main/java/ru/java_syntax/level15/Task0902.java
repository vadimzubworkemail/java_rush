package ru.java_syntax.level15;

/*
И снова StackTrace
*/

public class Task0902 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(s);
        return s;
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        String s = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(s);
        return s;
    }
}

