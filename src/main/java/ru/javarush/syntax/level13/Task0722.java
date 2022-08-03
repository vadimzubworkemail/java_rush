package ru.javarush.syntax.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/

public class Task0722 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            }
            arrayList.add(s);
        }
        for (String list : arrayList) {
            System.out.println(list);
        }
    }
}
