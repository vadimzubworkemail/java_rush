package ru.javarush.tasks.level8.tasks;

public class BoardGame {

    String name;

    public BoardGame(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
