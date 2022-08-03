package ru.javarush.syntax.level13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Три массива
*/
public class Task0713 {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 2 == 0) {
                divBy3.add(number);
                divBy2.add(number);
            } else if (number % 3 == 0) {
                divBy3.add(number);
            } else if (number % 2 == 0) {
                divBy2.add(number);
            } else others.add(number);
        }
        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}