package ru.java_core.level14;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task1414 {
    public static void main(String[] args) {
        final String testFile = "src\\main\\resources\\java_test";
        String key = null;
        Movie movie = null;
        try (final BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            while ((key = reader.readLine()) != null) {
                movie = MovieFactory.getMovie(key);
                if (key.matches("cartoon|thriller|soapOpera")) {
                    System.out.println(movie.getClass().getSimpleName());
                } else break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
