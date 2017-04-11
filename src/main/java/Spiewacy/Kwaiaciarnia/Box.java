package Spiewacy.Kwaiaciarnia;

import java.util.ArrayList;

/**
 * Created by Marek on 2017-04-06.
 */
public class Box {
    protected Customer customer = null;
    protected ArrayList<Flower> items = null;

    public Box(Customer customer) {
        this.customer = customer;
    }

    public void set(ArrayList<Flower> items) {
        this.items = items;
    }
    public ArrayList<Flower> get() {
        return items;
    }

    @Override
    public String toString() {
        String shoppingCartItems = "Pudełko właściciel " +customer.name +"\n";
        if(items.isEmpty()) {
            shoppingCartItems = "-- pusto";
        }
        else {
            for (Flower item : items) {
                shoppingCartItems += item.name +", kolor: " +item.color +", ilość " +item.count
                        +", cena " +PriceList.getInstance().getPrice(item.name) +"\n";
            }
        }
        return shoppingCartItems;
    }
}
