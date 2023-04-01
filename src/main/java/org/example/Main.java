package org.example;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("butter", 50, 5.0, 5);
        Product prod2 = new Product("kolbasa", 50, 5.0, 5);
        Product prod3 = new Product("game", 50, 5.0, 5);
        Product prod4 = new Product("gameball", 50, 5.0, 5);
        Product prod5 = new Product("dress", 50, 5.0, 5);
        Product prod6 = new Product("socks", 50, 5.0, 5);
        Category eat = new Category("eat");
        eat.addCategory(prod1);
        eat.addCategory(prod2);
        Category game = new Category("game");
        game.addCategory(prod3);
        game.addCategory(prod4);
        Category dress = new Category("dress");
        dress.addCategory(prod5);
        dress.addCategory(prod6);
        User user1 = new User("ivan", "qwerty1");
        User user2 = new User("maria", "qwerty2");
        User user3 = new User("dmitrii", "qwerty3");
        System.out.println("Список товаров:");
        System.out.println(eat);
        System.out.println(game);
        System.out.println(dress);
        user1.setBasket(prod1, 1);
        user2.setBasket(prod3, 4);
        user1.setBasket(prod5, 2);
        user3.setBasket(prod6, 2);
        System.out.println("Список покупок");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("Список товаров после покупок");
        System.out.println(eat);
        System.out.println(game);
        System.out.println(dress);
    }
}