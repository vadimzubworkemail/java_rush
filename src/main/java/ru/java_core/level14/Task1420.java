package ru.java_core.level14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1420 {
    public static void main(String[] args) {
        final String testFile = "src\\main\\resources\\java_test";
        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Math.min(a, b);
            int nod = 0;
            for (int i = 1; i <= c; i++) {
                if (a % i == 0 && b % i == 0) {
                    nod = i;
                }
            }
            System.out.println(nod);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
