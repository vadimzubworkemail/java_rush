package ru.javarush.syntax.level3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
И 18-ти достаточно

Введи с клавиатуры имя и возраст.
Если возраст больше 20, выведи надпись: «И 18-ти достаточно».
*/
public class Task0423 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        String message = "И 18-ти достаточно";

        if (age > 20){
            System.out.println(message);
        }
    }
}
