package Bestellungen;

import java.util.Objects;

public class Bestellzeile {
    private String name;
    private int menge;
    private int preis;

    public Bestellzeile(String name, int menge, int preis) {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public int getPreis() {
        return preis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bestellzeile that = (Bestellzeile) o;
        return menge == that.menge && preis == that.preis && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, menge, preis);
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", preis=" + preis +
                '}';
    }
    public double getKosten(){
        double kosten = getMenge() *getPreis();
        return kosten;
    }
}
