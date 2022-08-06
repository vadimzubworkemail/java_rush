package ru.java_syntax.level14;

import java.util.ArrayList;
import java.util.Collections;

/*
Вся семья в сборе
*/

public class Task0824 {
    public static void main(String[] args) {
        Human vasya = new Human("Vasya", true, 4);
        Human petya = new Human("Petya", true, 2);
        Human masha = new Human("Masha", false, 3);

        Human papa = new Human("Papa", true, 39, vasya, petya, masha);
        Human mama = new Human("Mama", false, 34, vasya, petya, masha);

        Human fathersFather = new Human("Петрович", true, 73, papa);
        Human fathersMother = new Human("Кузминична", false, 69, papa);
        Human mothersFather = new Human("Василич", true, 74, mama);
        Human mothersMother = new Human("Агрипиновна", false, 69, mama);

        System.out.println(fathersFather);
        System.out.println(fathersMother);
        System.out.println(mothersFather);
        System.out.println(mothersMother);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(masha);

    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
