package be.intecbrussel.SingletonPattern;

public class ProductApp {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();

        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        // adding both products
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.displayProducts();

        // removing 1 product
        inventory.removeProduct(product2);
        inventory.displayProducts();
    }
}
