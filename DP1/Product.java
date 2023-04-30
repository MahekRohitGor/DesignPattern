package DP1;

import java.util.ArrayList;
import java.util.List;

//The subject being observed
public class Product {
 private String name;
 private boolean isPurchased;
 private List<ProductObserver> observers = new ArrayList<>();

 public Product(String name) {
     this.name = name;
 }

 public void addObserver(ProductObserver observer) {
     observers.add(observer);
 }

 public void removeObserver(ProductObserver observer) {
     observers.remove(observer);
 }

 public void setPurchased() {
     isPurchased = true;
     notifyObservers();
 }

 private void notifyObservers() {
     for (ProductObserver observer : observers) {
         observer.update(this);
     }
 }

 public String getName() {
     return name;
 }

 public boolean isPurchased() {
     return isPurchased;
 }
}
