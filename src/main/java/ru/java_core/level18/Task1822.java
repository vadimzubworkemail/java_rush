package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Task1822 {
    public static void main(String[] args) throws IOException {
        final String fileName;
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        String str;
        try (final BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((str = reader.readLine()) != null){
                String[] strings = str.split(" ");
                if (Objects.equals(strings[0], args[0])){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
