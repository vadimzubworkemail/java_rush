package ru.javarush.tasks.level13;

/*
Семья
*/

public class Task0724 {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Petrovich", true, 65);
        Human grandMother1 = new Human("Petrovna", false, 63);
        Human grandFather2 = new Human("Sidorovich", true, 65);
        Human grandMother2 = new Human("Victorovna", false, 63);
        Human father = new Human("Vasya", true, 35, grandFather1, grandMother1);
        Human mother = new Human("Masha", false, 33, grandFather2, grandMother2);
        Human daughter = new Human("Frosya", false, 5, father, mother);
        Human sun = new Human("Mitya", false, 3, father, mother);
        Human daughter2 = new Human("Dasha", false, 3, father, mother);

        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(sun);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(daughter2);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
    }

    public static class Human {
        private final String name;
        private final boolean sex;
        private final int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
