package Spiewacy.Kwaiaciarnia;

import java.util.HashMap;

/**
 * Created by Marek on 2017-04-06.
 */
public class PriceList {
    private PriceList() {
    }

    public HashMap<String, Double> priceList = new HashMap<String, Double>();

    private static PriceList instance = new PriceList();

    public static PriceList getInstance() {
        return instance;
    }

    public void put(String flowerName, double price) {
        priceList.put(flowerName, price);
    }

    public Double getPrice(String flowerName) {
        if (instance.priceList.containsKey(flowerName)) {
            return instance.priceList.get(flowerName);
        }
        else {
            return -1.0;
        }
    }
}