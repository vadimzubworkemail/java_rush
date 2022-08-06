package ru.java_syntax.level16;

/*
Обратный отсчет от 5 до 0
*/

public class Task0920 {
    public static void main(String[] args) {
        try {
            for (int i = 5; i >= 0; i--) {
                Thread.sleep(100);
                System.out.println(i);
        }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
