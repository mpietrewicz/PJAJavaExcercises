package Kalkulator;

import java.math.BigDecimal;

/**
 * Created by Marek on 2017-04-14.
 */
public class Mnozenie extends Operacja {

    public BigDecimal wykonaj(BigDecimal liczba1, BigDecimal liczba2) {
        BigDecimal wynik = new BigDecimal(String.valueOf(liczba1.multiply(liczba2)));
        return wynik;
    }
}
