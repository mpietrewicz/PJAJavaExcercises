package Spiewacy.Kwaiaciarnia;

/**
 * Created by Marek on 2017-04-06.
 */
public class Flower {
    protected String name;
    protected String color;
    protected int count;

    public Flower(int count) {
        this.count = count;
    }
}

class Rose extends Flower{
    public Rose(int count) {
        super(count);
        super.name = "róża";
        super.color = "czerwona";
    }
}

class Peony extends Flower{
    public Peony(int count) {
        super(count);
        super.name = "piwonia";
        super.color = "czerwona";
    }
}

class Freesia extends Flower{
    public Freesia(int count) {
        super(count);
        super.name = "frezja";
        super.color = "żółty";
    }
}

class Lilac extends Flower{
    public Lilac(int count) {
        super(count);
        super.name = "bez";
        super.color = "biały";
    }
}

