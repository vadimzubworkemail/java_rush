package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1827 {
    public static class Product {
        int id;
        String name;
        double price;
        int quantity;

        public Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8.2f%-4d", id, name, price, quantity);
        }

        public static Product getProduct(String str) {
            String id = str.substring(0, 8).trim();
            String name = str.substring(8, 38).trim();
            String price = str.substring(38, 46).trim();
            String quantity = str.substring(46, 50).trim();
            return new Product(Integer.parseInt(id), name, Double.parseDouble(price), Integer.parseInt(quantity));
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        final String fileName;
        final List<Product> products = new ArrayList<>();
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (final BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = Product.getProduct(fileReader.readLine());
                products.add(product);
            }
        }
        if (args[0].equals("-c")) {
            int id = 0;
            for (Product product : products){
                if (product.id > id) id = product.id;
            }
            StringBuilder name = new StringBuilder();
            for (int i = 1; i < args.length - 2; i++) {
                name.append(args[i]).append(" ");
            }
            if (name.length() > 30){
                name = new StringBuilder(name.substring(0, 30));
            }
            String price = args[args.length - 2];
            if (price.length() > 8){
                price = price.substring(0, 8);
            }
            String quantity = args[args.length - 1];
            if (quantity.length() > 4){
                quantity = quantity.substring(0, 4);
            }
            Product product = new Product(++id, name.toString().trim(), Double.parseDouble(price), Integer.parseInt(quantity));
            try (final FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write("\n");
                fileWriter.write(product.toString());
            }
        }
    }
}
