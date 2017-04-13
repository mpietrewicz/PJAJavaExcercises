package Kwaiaciarnia;

/**
 * Created by Marek on 2017-04-06.
 */
class Flower {
    String name;
    String color;
    int count;

    Flower(int count) {
        this.count = count;
    }
}

class Rose extends Flower{
    Rose(int count) {
        super(count);
        super.name = "róża";
        super.color = "czerwony";
    }
}

class Peony extends Flower{
    Peony(int count) {
        super(count);
        super.name = "piwonia";
        super.color = "czerwony";
    }
}

class Freesia extends Flower{
    Freesia(int count) {
        super(count);
        super.name = "frezja";
        super.color = "żółty";
    }
}

class Lilac extends Flower{
    Lilac(int count) {
        super(count);
        super.name = "bez";
        super.color = "biały";
    }
}

class Cloves extends Flower{
    public Cloves(int count) {
        super(count);
        super.name = "gozdziki";
        super.color = "biały";
    }
}

