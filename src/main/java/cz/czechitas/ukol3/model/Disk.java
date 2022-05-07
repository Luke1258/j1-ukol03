package cz.czechitas.ukol3.model;

public class Disk {
    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public long kapacita;
    private long vyuziteMisto;

    @Override
    public String toString() {
        return "Kapacita: " + kapacita + " " + "Vyuzite misto: " + vyuziteMisto;
    }
}
