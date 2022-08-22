package ru.java_core.level15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1519 {
    public static void main(String[] args) {
        final String testFile = "src\\main\\resources\\java_test";
        try (final BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String s;
            while (!(s = reader.readLine()).equals("exit")) {
                try {
                    if (s.contains(".")) {
                        print(Double.parseDouble(s));
                    } else {
                        int integer = Integer.parseInt(s);
                        if (integer > 0 && integer < 128) {
                            print((short) integer);
                        } else {
                            print(integer);
                        }
                    }
                } catch (NumberFormatException e) {
                    print(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
