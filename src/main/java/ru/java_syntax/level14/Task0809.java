package ru.java_syntax.level14;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Измерить сколько времени занимает 10 тысяч вставок для каждого списка
*/

public class Task0809 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        final Date startTime = new Date();
        insert10000(list);
        final Date finishTime = new Date();
        long elapsedTime = finishTime.getTime() - startTime.getTime();
        return elapsedTime;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
