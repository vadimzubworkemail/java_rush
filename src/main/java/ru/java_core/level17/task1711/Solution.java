package ru.java_core.level17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Date date = inputFormat.parse(args[i + 2]);
                        Person person = args[i + 1].equals("м") ? Person.createMale(args[i], date) : Person.createFemale(args[i], date);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;
            case ("-u"): {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        allPeople.get(Integer.parseInt(args[i])).setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(inputFormat.parse(args[i + 3]));
                    }
                }
            }
            break;
            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        System.out.println(allPeople.get(id).getName() + " " +
                                (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " +
                                outputFormat.format(allPeople.get(id).getBirthDate()));
                    }
                }
                break;
        }
    }
}
