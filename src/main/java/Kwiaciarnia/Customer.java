package Kwiaciarnia;

/**
 * Created by Marek on 2017-04-04.
 */
public class Customer {
    String name;
    int money;
    ShoppingCart shoppingCart = new ShoppingCart();

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void get(Flower flower) {
        shoppingCart.cart.put(flower, flower.count);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void pay() {
        System.out.println("Płatność");
    }
}
