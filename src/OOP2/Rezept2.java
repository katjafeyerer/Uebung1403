package OOP2;

import OOP.Zutat;

import java.util.Arrays;
import java.util.Objects;

public class Rezept2 {
    private String name;
    private int personen;
    private Zutat2[] zutaten;

    public Rezept2(String name, int personen, Zutat2[] zutaten) {
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

    public Zutat2[] getZutaten() {
        return zutaten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rezept2 rezept = (Rezept2) o;
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
        System.out.println("Rezeptname " + this.name);
        for (int i = 0; i < zutaten.length; i++) {
            System.out.println(zutaten[i].toString());
        }
    }
    public Rezept2 umrechnen(int personen){
        double faktor = personen/ getPersonen() * 1.0;
        Zutat2[] neueZutaten = new Zutat2[this.zutaten.length];
        for (int i = 0; i < zutaten.length; i++) {
            neueZutaten[i] = new Zutat2(this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge() * faktor));
        }
        Rezept2 rezept2 = new Rezept2(this.name, personen, neueZutaten);
        return rezept2;
    }
}
