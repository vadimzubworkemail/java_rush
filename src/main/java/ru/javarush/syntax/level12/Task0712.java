package ru.javarush.syntax.level12;
import com.github.javafaker.Faker;

import java.io.IOException;
import java.util.ArrayList;

/*
Минимальное или максимальное
*/

public class Task0712 {

    public static ArrayList<String> strings;
    public static final Faker faker = new Faker();

    public static void main(String[] args) throws IOException {
//        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
//            strings.add(reader.readLine());
            strings.add(faker.funnyName().name());
        }
        String minString = strings.get(0);
        String maxString = strings.get(0);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minString.length()) {
                minString = strings.get(i);
                minIndex = i;
            } else if (strings.get(i).length() > maxString.length()) {
                maxString = strings.get(i);
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(minString);
        } else {
            System.out.println(maxString);
        }
//        Моё неверное решение (((
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.get(i).length() < minString.length()) {
//                minString = strings.get(i);
//                minIndex = i;
//            } else if (strings.get(i).length() > maxString.length()) {
//                maxString = strings.get(i);
//                maxIndex = i;
//            }
//        }
//        if (maxIndex > minIndex) {
//            System.out.println("maxString: " + maxString);
//        } else {
//            System.out.println("minString: " + minString);
//        }
    }
}