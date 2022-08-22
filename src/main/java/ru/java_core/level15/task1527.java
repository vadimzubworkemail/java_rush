package ru.java_core.level15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Парсер реквестов
*/

public class task1527 {
    public static void main(String[] args) throws IOException {
        final String testFile = "src\\main\\resources\\java_test";
        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String value = null;
            String url = reader.readLine();
            String param = url.substring(url.lastIndexOf("?") + 1);
            String[] splitParams = param.split("&");

            final StringBuilder stringBuilder = new StringBuilder();
            for (String split : splitParams) {
                String[] s1 = split.split("=");
                stringBuilder.append(s1[0]);
                stringBuilder.append(" ");

                if (s1[0].contains("obj")) {
                    value = s1[1];
                }
            }
            System.out.println(stringBuilder.toString().trim());

            if (value != null) {
                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException nfe) {
                    alert(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
