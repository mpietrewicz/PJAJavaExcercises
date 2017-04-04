package Spiewacy;

/**
 * Created by Marek on 2017-03-31.
 */
public abstract class Spiewak {
    protected String nazwisko;
    protected static int aktualnyNumerStartowy;
    protected int numerStartowy;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        this.aktualnyNumerStartowy++;
        this.numerStartowy = aktualnyNumerStartowy;
    }

    abstract String spiewaj();

    @Override
    public String toString() {
        return "(" + numerStartowy + ") " + nazwisko;
    }

    static public Spiewak najglosniej(Spiewak[] spiewacy) {
        return spiewacy[0];
    }



}
