package ru.javarush.tasks.level12;

import com.github.javafaker.Faker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удали последнюю строку и вставь её в начало
*/

public class Task0711 {
    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Faker faker = new Faker();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
//            stringList.add(bufferedReader.readLine());
            stringList.add(faker.superhero().name());
        }
        for (int i = 0; i < 13; i++) {
            String s = stringList.remove(4);
            stringList.add(0, s);
        }
        for (String str : stringList){
            System.out.println(str);
        }
    }
}
