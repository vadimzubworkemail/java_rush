package ru.javarush.syntax.level14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Удалить всех людей, родившихся летом
*/

public class Task0816 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Пупкин", dateFormat.parse("JUNE 12 2010"));
        map.put("Вася", dateFormat.parse("JUNE 11 2012"));
        map.put("Петя", dateFormat.parse("JULY 21 2012"));
        map.put("Коля", dateFormat.parse("AUGUST 1 2000"));
        map.put("Саша", dateFormat.parse("JUNE 19 2012"));
        map.put("Дима", dateFormat.parse("AUGUST 14 2010"));
        map.put("Витя", dateFormat.parse("JUNE 1 2002"));
        map.put("Юра", dateFormat.parse("AUGUST 1 2012"));
        map.put("Игорь", dateFormat.parse("JULY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            int month = pair.getValue().getMonth() + 1;
            if (month > 5 && month < 9) {
                map.remove(pair.getKey());
            }
        }
//        System.out.println(map);
    }

    public static void main(String[] args) throws ParseException {
//        removeAllSummerPeople(createMap());
    }
}
