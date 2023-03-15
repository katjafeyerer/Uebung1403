package OOP2;

import java.util.Objects;

public class Zutat2 {
    private String name;
    private int menge;

    public Zutat2(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zutat2 rezept = (Zutat2) o;
        return menge == rezept.menge && Objects.equals(name, rezept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, menge);
    }
}
