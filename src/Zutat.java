import java.util.Objects;

public class Zutat {
    private String name;
    private int menge;

    public Zutat(String name, int menge) {
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
        return "Zutat{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zutat zutat = (Zutat) o;
        return menge == zutat.menge && Objects.equals(name, zutat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, menge);
    }
}
