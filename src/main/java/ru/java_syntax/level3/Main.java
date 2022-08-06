package ru.java_syntax.level3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 21) {
            System.out.println("You can't drink");
            System.out.println(":(");
        } else {
            System.out.println("You must drink");
            System.out.println(":)");
        }
        System.out.println("jfskvj");
    }
}
