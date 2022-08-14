package ru.java_core.level14.task1411;

import java.io.BufferedReader;
import java.io.FileReader;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        final String testFile = "src\\main\\resources\\java_test";
        BufferedReader reader = new BufferedReader(new FileReader(testFile));
        Person person = null;
        String key;
        while (true) {
             key = reader.readLine();
            if (!(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))) break;

            switch (key){
                case ("user"):
                    person = new Person.User();
                    break;
                case ("loser"):
                    person = new Person.Loser();
                    break;
                case ("coder"):
                    person = new Person.Coder();
                    break;
                case ("proger"):
                    person = new Person.Proger();
                    break;
            }
            doWork(person);
        }
        reader.close();
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
