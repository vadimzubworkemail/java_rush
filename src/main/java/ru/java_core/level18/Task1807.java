package ru.java_core.level18;

import java.io.*;

/*
Подсчет запятых
*/

public class Task1807 {
    public static void main(String[] args) {
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(reader.readLine())) {
            while (stream.available() > 0){
                if (stream.read() == 44) sum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}
