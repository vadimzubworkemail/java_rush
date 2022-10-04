package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task1802 {
    public static void main(String[] args) {
        ArrayList<Integer> minByte = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            while (inputStream.available() > 0){
                minByte.add(inputStream.read());
            }
            System.out.println(Collections.min(minByte));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
