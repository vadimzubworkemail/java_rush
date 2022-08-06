package ru.java_syntax.level7;

/*
Кубический калькулятор
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
*/

public class Task0608 {
    public static void main(String[] args) {

        System.out.println(cube(3));
    }

    public static long cube(long number) {
        number = number * number * number;
        return number;
    }
}
