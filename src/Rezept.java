import java.util.Arrays;
import java.util.Objects;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rezept rezept = (Rezept) o;
        return personen == rezept.personen && Objects.equals(name, rezept.name) && Arrays.equals(zutaten, rezept.zutaten);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, personen);
        result = 31 * result + Arrays.hashCode(zutaten);
        return result;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
    public void printRezept(){
        System.out.println("this.name = " + this.name);

        for (int i = 0; i < zutaten.length; i++) {
            System.out.println("Zutat: " + zutaten[i]);
        }
    }
    public Rezept umrechnen(int personen){
        int faktor = personen / getPersonen() *1;
        Zutat[] neueZutaten = new Zutat[this.zutaten.length];
        for (int i = 0; i < neueZutaten.length; i++) {
            neueZutaten[i] = new Zutat(this.zutaten[i].getName(), (int) this.zutaten[i].getMenge()*faktor);
        }
        Rezept rezeptNeu = new Rezept(getName(), personen, neueZutaten);
        return rezeptNeu;
    }
}
