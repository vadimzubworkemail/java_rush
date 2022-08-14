package ru.java_core.level14;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task1407 {

    public static void main(String[] args) throws Exception {
        final String fileTest = "src\\main\\resources\\java_test";
        BufferedReader reader = new BufferedReader(new FileReader(fileTest));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        if (person instanceof Dancer){
            Dancer dancer = (Dancer) person;
            dancer.dance();
        } else if (person instanceof Player){
            Player player = (Player) person;
            player.play();
        }
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
