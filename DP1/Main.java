package DP1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("iPhone");
        Product product2 = new Product("Nokia Phone");
        Seller seller1 = new Seller("John");
        Seller seller2 = new Seller("Alice");

        product1.addObserver(seller1);
        product1.addObserver(seller2);
        product2.addObserver(seller2);
        product2.addObserver(seller2);

        // Simulate a purchase
        product1.setPurchased();
        product2.setPurchased();
    }
}