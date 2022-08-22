package ru.java_core.level15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Task1531 {
    public static void main(String[] args) throws IOException {
        final String testFile = "src\\main\\resources\\java_test";
        BufferedReader reader = new BufferedReader(new FileReader(testFile));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal factorial = BigDecimal.valueOf(1);
        if (n < 0) {
            return Integer.toString(0);
        } else if (n == 0) {
            return Integer.toString(1);
        } else {

            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(BigDecimal.valueOf(i));
            }
        }
        return factorial.toString();
    }
}
