package be.intecbrussel.Deel1.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static Inventory instance;
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }
    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        System.out.println("Inventory Products:");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println();
    }
//private List<Product> products;
//
//    private Inventory() {
//        products = new ArrayList<>();
//    }
//
//    public static Inventory getInstance() {
//        return InventoryPlace.instance;
//    }
//
//    private static class InventoryPlace {
//        private static final Inventory instance = new Inventory();
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }
//
//    public void displayProducts() {
//        System.out.println("Inventory Products:");
//        for (Product product : products) {
//            System.out.println(product.getName());
//        }
//        System.out.println();
//    }
}
