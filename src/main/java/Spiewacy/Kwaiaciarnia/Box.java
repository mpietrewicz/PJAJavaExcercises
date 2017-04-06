package Spiewacy.Kwaiaciarnia;

/**
 * Created by Marek on 2017-04-06.
 */
public class Box {
    public Customer customer;

    public Box(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Box{" +
                "customer=" + customer +
                '}';
    }
}
