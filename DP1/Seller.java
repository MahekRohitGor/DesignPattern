package DP1;

public class Seller implements ProductObserver {
    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public void update(Product product) {
        if (product.isPurchased()) {
            System.out.println("Seller " + name + ", your product " + product.getName() + " has been purchased.");
        }
    }
}