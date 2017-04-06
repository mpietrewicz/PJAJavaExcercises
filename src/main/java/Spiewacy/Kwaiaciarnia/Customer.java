package Spiewacy.Kwaiaciarnia;

import java.util.ArrayList;

/**
 * Created by Marek on 2017-04-06.
 */
public class Customer {
    protected String name;
    protected int cash;
    protected ShoppingCart shoppingCart = new ShoppingCart() {
        public ArrayList<Flower> flowers = new ArrayList<Flower>();

        public void set(Flower flower) {
            flowers.add(flower);
        }
        public ArrayList<Flower> get() {
             return flowers;
        }
        public void del(Flower flower) {
            flowers.remove(flower);
        }

        @Override
        public String toString() {
            String shoppingCartItems = "Wózek właściciel " +name +"\n";
            for (Flower flower : flowers) {
                shoppingCartItems += flower.name +", kolor: " +flower.color +", ilość " +flower.count
                +", cena " +PriceList.getPrice(flower.name) +"\n";
            }
            return shoppingCartItems;
        }
    };

    public Customer(String name, int money) {
        this.name = name;
        this.cash = money;
    }

    public void get(Flower flower) {
        shoppingCart.set(flower);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void pay() {
        ArrayList<Flower> flowersInShoppingCart = (ArrayList<Flower>) shoppingCart.get().clone();
        for (Flower flower : flowersInShoppingCart) {
            if(PriceList.getPrice(flower.name) == -1.0) {
                shoppingCart.del(flower);
            }
            else if ((double) cash < PriceList.getPrice(flower.name) * flower.count) {
                shoppingCart.del(flower);
            }
            else {
                cash = (int) (cash - PriceList.getPrice(flower.name) * flower.count);
            }
        }
    }

    public int getCash() {
        return cash;
    }

    public void pack(Box pudelkoJanka) {
    }
}
