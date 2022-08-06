package ru.java_syntax.level8.date;

import java.util.Date;

//Наступило ли уже некоторое время:
public class HasTheTimeCome {
    public static void main(String[] args) throws InterruptedException {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(3000);

        Date currentDate = new Date();
        if (currentDate.after(endDate)) {
//            after() проверяет, что дата, у которой мы вызвали метод, идет после переданной в метод даты after.
            System.out.println("End time!");
        }
    }
}
