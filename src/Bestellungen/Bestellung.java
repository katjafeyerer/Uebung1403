package Bestellungen;

import java.util.Arrays;
import java.util.Objects;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bestellung that = (Bestellung) o;
        return Objects.equals(nummer, that.nummer) && Arrays.equals(zeilen, that.zeilen);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nummer);
        result = 31 * result + Arrays.hashCode(zeilen);
        return result;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "nummer='" + nummer + '\'' +
                ", zeilen=" + Arrays.toString(zeilen) +
                '}';
    }
    public void printBestellung(){
        System.out.println("Bestellung: " + getNummer());
        for (Bestellzeile bz : zeilen) {
            System.out.println("Name : " + bz.getName());
            System.out.println("Menge : " + bz.getMenge());
            System.out.println("Preis: " + bz.getPreis());
        }
    }
    public double getKosten(){
        double totalCosts = 0;
        for (Bestellzeile bz: zeilen) {
            totalCosts += bz.getKosten();
        }
        return totalCosts;
    }
}
