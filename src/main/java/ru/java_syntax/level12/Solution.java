package ru.java_syntax.level12;

/*
Конструкторы класса Human
*/
public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//            генерируем случайные числа от -100 до 100
            array[i] = (int) (Math.random()*(200+1)) - 100;
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}


