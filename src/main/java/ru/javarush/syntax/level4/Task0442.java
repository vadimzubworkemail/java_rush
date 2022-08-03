package ru.javarush.syntax.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование

Давай напишем программу, в которой нужно будет вводить числа с клавиатуры,
и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.
Подсказка: один из вариантов решения этой задачи - использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
break;
}


*/
public class Task0442 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            i += num;
            if (num == -1) {
                break;
            }
        }
        System.out.println(i);
    }
}

