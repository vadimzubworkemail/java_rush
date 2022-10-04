package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task1801 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            ArrayList<Integer> bytes = new ArrayList<>();
            while (inputStream.available() > 0){
                bytes.add(inputStream.read());
            }
            System.out.println(Collections.max(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
