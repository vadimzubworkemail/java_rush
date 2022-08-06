package ru.java_syntax.level3;

/*
Программа учета имен
Допиши код метода setName, чтобы с его помощью установить значение private String fullName,
равное значению локальной переменной String fullName.
*/

public class Cat {
    private String fullName;

    public static void main(String[] args) {
// создаю объект и вызываю метод для проверки
        Cat cat = new Cat();
        cat.setName("vasily", "petrovich");
        System.out.println(cat.fullName);
    }

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;//напишите тут ваш код
    }
}
