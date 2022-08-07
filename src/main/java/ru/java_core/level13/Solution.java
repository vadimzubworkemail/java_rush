package ru.java_core.level13;

import java.awt.*;

/*
������ � ��� ����� ��������
*/

public class Solution {
    public static void main(String[] args) {

    }

    //����� ���������
    public interface Movable {
        void move();
    }

    //����� ���� ������
    public interface Edible {
        void beEaten();
    }

    //����� ����-������ ������
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
