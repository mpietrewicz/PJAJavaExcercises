package Kwiaciarnia;

import java.util.HashMap;

/**
 * Created by Marek on 2017-04-04.
 */
public class PriceList {
    HashMap<String, Double> priceList = new HashMap<String, Double>();

    public void put(String flowerName, double price) {
        priceList.put(flowerName, price);
    }
}
