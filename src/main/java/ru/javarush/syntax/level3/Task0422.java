package ru.javarush.syntax.level3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
18+

Введи с клавиатуры имя и возраст.
Если возраст меньше 18, выведи надпись: «Подрасти еще».
*/
public class Task0422 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        String message = "Подрасти еще";

        if (age < 18){
            System.out.println(message);
        }
    }
}
