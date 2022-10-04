package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1803 {
    public static void main(String[] args) throws Exception {
        int[] list = new int[256];
        ArrayList<Integer> checkList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(reader.readLine())) {
            while (stream.available() > 0) {
                list[stream.read()] += 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int num = 0;
        for (Integer integer : list){
            if (integer > num){
                num = integer;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num){
                checkList.add(i);
            }
        }
        for (Integer integer : checkList){
            System.out.print(integer + " ");
        }
    }
}
