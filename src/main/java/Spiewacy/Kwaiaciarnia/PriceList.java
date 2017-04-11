package Spiewacy.Kwaiaciarnia;

import java.util.HashMap;

/**
 * Created by Marek on 2017-04-06.
 */
class PriceList {
    private PriceList() {
    }

    private HashMap<String, Double> priceList = new HashMap<String, Double>();

    private static PriceList instance = new PriceList();

    static PriceList getInstance() {
        return instance;
    }

    void put(String flowerName, double price) {
        priceList.put(flowerName, price);
    }

    Double getPrice(String flowerName) {
        if (instance.priceList.containsKey(flowerName)) {
            return instance.priceList.get(flowerName);
        }
        else {
            return -1.0;
        }
    }
}