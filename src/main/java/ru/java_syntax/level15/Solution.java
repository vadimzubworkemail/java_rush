package ru.java_syntax.level15;

import java.io.IOException;
import java.rmi.RemoteException;

/*
Перехват checked исключений
*/


public class Solution {
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        handleExceptions(new Task0917());

    }

    public static void handleExceptions(Task0917 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
