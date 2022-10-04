package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1804 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ints = new int[256];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(reader.readLine())) {
            while (stream.available() > 0) {
                ints[stream.read()]++;
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (int i : ints){
            if (i < minCount && i > 0){
                minCount = i;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == minCount){
                list.add(i);
            }
        }
        for (Integer integer : list){
            System.out.print(integer + " ");
        }
    }
}