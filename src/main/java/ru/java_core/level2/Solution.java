package ru.java_core.level2;

/*
�� �� �����, �� �� �����
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        switch (o.getClass().getSimpleName()){
            case ("Cat"):
                System.out.println("�����");
                break;
            case ("Dog"):
                System.out.println("������");
                break;
            case ("Bird"):
                System.out.println("�����");
                break;
            case ("Lamp"):
                System.out.println("�����");
                break;
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}