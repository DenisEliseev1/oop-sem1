package org.example;

import java.util.ArrayList;

public class Basket {


    private Product p = new Product("0",0, 0.0,0);
    private ArrayList<Product> array = new ArrayList<>();
    public ArrayList<Product> getArray() {
        return array;
    }

    public void addProduct(Product p) {
        array.add(p);
    }
    public Basket() {
        array.add(p);
    }
    @Override
    public String toString() {
        return  "basket=" + array;
    }
}
