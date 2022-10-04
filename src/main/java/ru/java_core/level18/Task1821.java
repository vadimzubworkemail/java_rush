package ru.java_core.level18;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Встречаемость символов
*/

public class Task1821 {
    public static void main(String[] args) throws Exception {
        final List<Character> characters = new ArrayList<>();
        final Map<Character, Integer> map = new TreeMap<>();

        try (final FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()){
                characters.add((char) fileReader.read());
            }
        }
        for (Character character : characters){
            if (!map.containsKey(character)){
                map.put(character, 1);
            } else map.compute(character, (a, b) -> b += 1);
        }
        for (Map.Entry<Character, Integer> parse : map.entrySet()){
            System.out.println(parse.getKey() + " " + parse.getValue());
        }
    }
}

