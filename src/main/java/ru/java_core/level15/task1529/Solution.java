package ru.java_core.level15.task1529;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        final String testFile = "src\\main\\resources\\java_test";
        try (final BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String air = reader.readLine();
                if (air.equals("helicopter")) {
                    result = new Helicopter();
                } else if (air.equals("plane")) {
                    result = new Plane(Integer.parseInt(reader.readLine()));
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
