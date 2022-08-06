package ru.java_syntax.level13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удвой слова
*/

public class Test0717 {
    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s : result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        final ArrayList<String> strings = new ArrayList<>();
        for (String s : list){
            strings.add(s);
            strings.add(s);
        }
        return strings;
    }
}
