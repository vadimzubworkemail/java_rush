package ru.javarush.syntax.level10;

public class Task0501 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2, 2, 2);
        Cat cat2 = new Cat("Sam", 2, 2, 2);
        Cat cat3 = new Cat("Fiona", 3, 3, 3);

//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat1.fight(cat3));
//        System.out.println(cat2.fight(cat3));

        if(cat1.fight(cat2) && cat1.fight(cat3) == true){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (cat2.fight(cat1) && cat2.fight(cat3) == true){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (cat3.fight(cat1) && cat3.fight(cat2) == true){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
//                  Моё решение(и почему-то неверное)

//        public boolean fight(Cat anotherCat) {
//            int scoreAnotherCat = anotherCat.age + anotherCat.weight + anotherCat.strength;
//            int scoreThisCat = this.age + this.weight + this.strength;
//            if (scoreAnotherCat < scoreThisCat){
//                return true;
//            } else if (scoreAnotherCat > scoreThisCat){
//                return false;
//            } else return false;

        //                   Решение Java Rush
        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}

