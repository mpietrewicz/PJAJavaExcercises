package Spiewacy.Kwaiaciarnia;

import java.util.ArrayList;

/**
 * Created by Marek on 2017-04-06.
 */
public class Customer {
    String name;
    private int cash;
    private ShoppingCart shoppingCart = new ShoppingCart() {
        ArrayList<Flower> flowers = new ArrayList<Flower>();

        public void set(Flower flower) {
            flowers.add(flower);
        }
        public ArrayList<Flower> get() {
             return flowers;
        }
        public void del(Flower flower) {
            flowers.remove(flower);
        }
        public void erase() {
            flowers = null;
        }

        @Override
        public String toString() {
            String shoppingCartItems = "Wózek właściciel " +name +"\n";
            if(flowers.isEmpty()) {
                shoppingCartItems = "-- pusto";
            }
            else {
                for (Flower flower : flowers) {
                    shoppingCartItems += flower.name +", kolor: " +flower.color +", ilość " +flower.count
                            +", cena " +PriceList.getInstance().getPrice((flower.name)) +"\n";
                }
            }
            return shoppingCartItems;
        }
    };



    Customer(String name, int money) {
        this.name = name;
        this.cash = money;
    }

    void get(Flower flower) {
        shoppingCart.set(flower);
    }

    ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    void pay() {
        ArrayList<Flower> flowersInShoppingCart = (ArrayList<Flower>) shoppingCart.get().clone();
        for (Flower flower : flowersInShoppingCart) {
            if(PriceList.getInstance().getPrice(flower.name) == -1.0) {
                shoppingCart.del(flower);
            }
            else if ((double) cash < PriceList.getInstance().getPrice(flower.name) * flower.count) {
                shoppingCart.del(flower);
            }
            else {
                cash = (int) (cash - PriceList.getInstance().getPrice(flower.name) * flower.count);
            }
        }
    }

    public int getCash() {
        return cash;
    }

    public void pack(Box box) {
        box.set(shoppingCart.get());
    }
}
