package Kalkulator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Marek on 2017-04-13.
 */
public class Dzielenie extends Operacja{

    public BigDecimal wykonaj(BigDecimal liczba1, BigDecimal liczba2) {
        BigDecimal wynik = new BigDecimal(String.valueOf(liczba1.divide(liczba2, 7, RoundingMode.HALF_EVEN)));
        return wynik;
    }
}
