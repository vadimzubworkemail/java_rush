package ru.java_syntax.level3;

public class Task0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Возраст: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Измененный возраст: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Измененный возраст = " + age + " + 20");
        }
    }
}

