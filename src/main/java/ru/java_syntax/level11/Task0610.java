package ru.java_syntax.level11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/

public class Task0610 {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(bufferedReader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(bufferedReader.readLine());
    }

    public static void main(String[] args) throws Exception {

    }
}


