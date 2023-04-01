package org.example;

public class User {
    private String login;
    private String password;

    private Product p1 = new Product();
    protected Basket basket = new Basket();


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Product p, Integer s) {
        p1 = new Product(p.getNameProduct(), p.getPriceProduct(), p.getReytingProduct(), p.getSumProduct());
        Integer x = p.getSumProduct()-s;
        p1.setSumProduct(s);
        basket.addProduct(p1);
        //System.out.println(p+ " " + p1);
        p.setSumProduct(x);
    }


    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + login +
                ", basket=" + basket +
                "}";
    }
}
