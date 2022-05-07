package cz.czechitas.ukol3.model;

public class Procesor {
    public String vyrobce;
    private long rychlost;

    @Override
    public String toString() {
        return "Vyrobce: " + vyrobce + " " + "Rychlost: " + rychlost;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }
}
