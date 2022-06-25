package ru.javarush.tasks.level8.date;


import java.util.Date;

//Сколько прошло времени с начала сегодняшнего дня:
public class TimeHasPassed {
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
