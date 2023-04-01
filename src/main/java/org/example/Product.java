package org.example;

public class Product {
    private String nameProduct;
    private Integer priceProduct;
    private Double reytingProduct;
    private Integer sumProduct;

    public Integer getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(Integer sumProduct) {
        this.sumProduct = sumProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Integer priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Double getReytingProduct() {
        return reytingProduct;
    }

    public void setReytingProduct(Double reytingProduct) {
        this.reytingProduct = reytingProduct;
    }


    /**
     *
     * @param nameProduct - наименование товара
     * @param priceProduct - стоимоть единицы товара
     * @param reytingProduct - рейтинг товара в магазине
     * @param sumProduct - количество товара в магазине
     */
    public Product(String nameProduct, Integer priceProduct, double reytingProduct, Integer sumProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.reytingProduct = reytingProduct;
        this.sumProduct = sumProduct;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + nameProduct +
                ", price=" + priceProduct +
                ", reyting='" + reytingProduct +  ", summa=" + sumProduct +
                "}";
    }
}
