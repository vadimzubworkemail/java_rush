package ru.javarush.syntax.level14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/

public class Task0812 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i++))) {
                maxCount ++;
            } else if (maxCount > count) {
                count = maxCount;
                maxCount = 1;
            } else {
                maxCount = 1;
            }
        }
        if (maxCount > count) {
            count = maxCount;
        }
        System.out.println(count);
    }
}
