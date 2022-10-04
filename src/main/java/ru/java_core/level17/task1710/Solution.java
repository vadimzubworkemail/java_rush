package ru.java_core.level17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    public static SimpleDateFormat outputDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    public static SimpleDateFormat inputDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person.createFemale("Пупкина Василиса", new Date()));
    }

    public static void main(String[] args) throws Exception {

        Person person;
        Date bd;
        switch (args[0]) {
            case ("-c"):
                bd = inputDate.parse(args[3]);
                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], bd);
                } else {
                    person = Person.createFemale(args[1], bd);
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;
            case ("-r"):
                person = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(person.getName() + " " +
                        (person.getSex() == Sex.MALE ? "м" : "ж") +
                        " " + outputDate.format(person.getBirthDate()));
                break;
            case ("-u"):
                bd = inputDate.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                person.setName(args[2]);
                if (args[3].equals("м")){
                    person.setSex(Sex.MALE);
                } else person.setSex(Sex.FEMALE);
                person.setBirthDate(bd);
                allPeople.set(id, person);
                break;
            case ("-d"):
                Person person1 = allPeople.get(Integer.parseInt(args[1]));
                person1.setName(null);
                person1.setSex(null);
                person1.setBirthDate(null);
                break;
        }
    }
}
