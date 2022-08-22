package ru.java_core.level15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
���� � ����������� �����
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (final BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while (reader.ready()){
                lines.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lines.forEach(System.out::println);
    }
}
