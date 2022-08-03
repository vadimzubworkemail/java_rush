package ru.javarush.syntax.level16;

import java.util.Scanner;

/*
Возврат к истокам
*/

public class Task1502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
