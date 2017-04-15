package Kalkulator;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Marek on 2017-04-13.
 */
public class Calc {
    public HashMap<String, Operacja> rodzajOperacji = new HashMap<String, Operacja>();

    public String doCalc(String arg) {
        try {
            rodzajOperacji.put("/", new Dzielenie());
            rodzajOperacji.put("+", new Dodawanie());
            rodzajOperacji.put("*", new Mnozenie());
            rodzajOperacji.put("-", new Odejmowanie());

            String[] args = arg.split("\\s+");

            BigDecimal liczba1 = new BigDecimal(args[0]);
            Operacja operacja = rodzajOperacji.get(args[1]);
            BigDecimal liczba2 = new BigDecimal(args[2]);
            BigDecimal wynik = operacja.wykonaj(liczba1, liczba2);

            // http://stackoverflow.com/questions/7493273/remove-trailing-decimal-point-zeroes-with-regex
            // Rohan Kandwal Sep 3 '14 at 10:24
            return wynik.toString().replaceAll("\\.*0*$", "");

        }
        catch (Throwable throwable) {
            return "Invalid command to calc";
        }

    }
}