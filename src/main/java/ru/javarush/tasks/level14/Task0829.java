package ru.javarush.tasks.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*
Нужно добавить в программу новую функциональность
*/

public class Task0829 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final Map<String, String> map = new HashMap<>();
        while (true){
            String city = reader.readLine();
            if (city.isEmpty()){
                break;
            }
            String name = reader.readLine();
            map.put(city, name);
        }
        String cityName = reader.readLine();
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (cityName.equals(pair.getKey())){
                System.out.println(pair.getValue());
            }
        }
    }
}
