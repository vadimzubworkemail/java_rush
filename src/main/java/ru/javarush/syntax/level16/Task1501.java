package ru.javarush.syntax.level16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Сокращаем try
*/

public class Task1501 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vadim Zub\\Desktop\\Java_test.txt"))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

