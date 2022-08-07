package ru.java_core.level13;

import java.awt.*;

/*
Ћисица Ч это такое животное
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигатьс€
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Edible {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    public class Dog implements Movable, Eat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
}
