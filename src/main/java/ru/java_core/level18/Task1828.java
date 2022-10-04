package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1828 {
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

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        final String fileName;
        List<Product> products = new ArrayList<>();
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (final BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = Product.getProduct(fileReader.readLine());
                products.add(product);
            }
        }
        switch (args[0]) {
            case "-u":
                int id = Integer.parseInt(args[1]);
                StringBuilder name = new StringBuilder();
                for (int i = 2; i < args.length - 2; i++) {
                    name.append(args[i]).append(" ");
                }
                if (name.length() > 30) {
                    name = new StringBuilder(name.substring(0, 30).trim());
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product updatedProduct;
                for (Product product : products) {
                    if (id == product.id) {
                        updatedProduct = product;
                        updatedProduct.setName(name.toString().trim());
                        updatedProduct.setPrice(Double.parseDouble(price));
                        updatedProduct.setQuantity(Integer.parseInt(quantity));
                    }
                }
                break;
            case "-d":
                id = Integer.parseInt(args[1]);
                Product deletedProduct = null;
                for (Product product : products) {
                    if (product.id == id) deletedProduct = product;
                }
                products.remove(deletedProduct);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + args[0]);
        }

        try (final FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : products){
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }
}
