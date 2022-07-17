package ru.javarush.tasks.level14;

import java.util.HashSet;
import java.util.Set;

/*
Множество всех животных
*/

public class Task0820 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCat = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            resultCat.add(new Cat());
        }

        return resultCat;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resultDog = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            resultDog.add(new Dog());
        }
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets){
            System.out.println(pet);
        }
    }

    public static class Cat {

    }
    public static class Dog {

    }
}
