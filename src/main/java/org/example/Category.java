package org.example;

import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList <Product> array = new ArrayList<>();

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList  getArray() {
        return array;
    }

    public void setArray(ArrayList array) {
        this.array = array;
    }


    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.array = array;
    }

    public Category() {
    }
    public void addCategory(Product prod) {
        this.array = array;
        array.add(prod);
    }

    @Override
    public String toString() {
        return "Category{name=" + nameCategory + ", list product" + array;
    }
}
