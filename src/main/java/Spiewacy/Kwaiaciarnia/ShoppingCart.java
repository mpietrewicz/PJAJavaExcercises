package Spiewacy.Kwaiaciarnia;

import java.util.ArrayList;

/**
 * Created by Marek on 2017-04-06.
 */
public abstract class ShoppingCart {

    public abstract void set(Flower flower);

    public abstract ArrayList<Flower> get();

    public abstract void del(Flower flower);
}
