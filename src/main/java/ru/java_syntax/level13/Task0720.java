package ru.java_syntax.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Task0720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            arrayList.add(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            arrayList.add(arrayList.remove(0));
        }
        for (String str : arrayList){
            System.out.println(str);
        }
    }
}
