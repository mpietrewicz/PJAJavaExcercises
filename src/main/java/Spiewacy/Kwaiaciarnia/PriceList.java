package Spiewacy.Kwaiaciarnia;

import java.util.HashMap;

/**
 * Created by Marek on 2017-04-06.
 */
public class PriceList {
    private PriceList() {
    }

    static public HashMap<String, Double> priceList = new HashMap<String, Double>();

    static private PriceList instance = new PriceList();

    public static PriceList getInstance() {
        return instance;
    }

    public void put(String flowerName, double price) {
        priceList.put(flowerName, price);
    }

    public static Double getPrice(String flowerName) {
        if (priceList.containsKey(flowerName)) {
            return priceList.get(flowerName);
        }
        else {
            return -1.0;
        }
    }
}
