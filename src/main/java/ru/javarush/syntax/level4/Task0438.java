package ru.javarush.syntax.level4;

/*
Рисуем линии

Используя цикл for, выведи на экран:
горизонтальную линию из 10 восьмёрок;
вертикальную линию из 10 восьмёрок (символ из горизонтальной линии не учитывается).
*/
public class Task0438 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++){
            System.out.print(8);
        }
        System.out.println();

        for (int j = 1; j <= 10; j++){
            System.out.println(8);
        }
    }
}
