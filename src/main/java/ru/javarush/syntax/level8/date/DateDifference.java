package ru.javarush.syntax.level8.date;

import java.util.Date;

//Вычисление разницы между двумя датами:
public class DateDifference {
    public static void main(String[] args) throws InterruptedException {
        Date currentTime = new Date(); // получаем текущую дату и время
        Thread.sleep(3000); // ждём 3 секунды
        Date newTime = new Date();
        long timeDifference = newTime.getTime() - currentTime.getTime();
        System.out.println("time difference is: " + timeDifference + " in ms");
    }
}
