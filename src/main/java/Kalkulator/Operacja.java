package Kalkulator;

import jdk.jfr.events.ExceptionThrownEvent;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Marek on 2017-04-13.
 */
public abstract class Operacja {

    public abstract BigDecimal wykonaj(BigDecimal liczba1, BigDecimal liczba2);
}
