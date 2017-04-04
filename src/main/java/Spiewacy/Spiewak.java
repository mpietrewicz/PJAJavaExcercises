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
        return "(" +numerStartowy +") " +nazwisko +": " +spiewaj();
    }

    static public Spiewak najglosniej(Spiewak[] spiewacy) {

        Spiewak najglosniejszySpiewak = spiewacy[0];
        int maxLiczbaDuzychLiter = 0;
        for (Spiewak spiewak : spiewacy) {
            int liczbaDuzychLiter = 0;
            for (char c : spiewak.spiewaj().toCharArray()) {
                if (new Character(c).isUpperCase(c)) {
                    liczbaDuzychLiter++;
                }
            }
            if (liczbaDuzychLiter > maxLiczbaDuzychLiter) {
                maxLiczbaDuzychLiter = liczbaDuzychLiter;
                najglosniejszySpiewak = spiewak;
            }
        }

        return najglosniejszySpiewak;
    }



}
