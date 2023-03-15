package OOP;

import java.util.Arrays;

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
    public void printRezept(){
        System.out.println("Name: " + this.name);
        System.out.println("Personen: " + this.personen);
        System.out.println("Zutaten: ");
        for (int i = 0; i < zutaten.length; i++) {
            System.out.println(this.zutaten[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }public Rezept umrechnen(int personen){
        double faktor = personen / getPersonen() *1.0;
        Zutat[] neueZutaten = new Zutat[this.zutaten.length];
        for (int i = 0; i < neueZutaten.length; i++) {
            neueZutaten[i] = new Zutat(this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge() * faktor));
        }
        Rezept neuesRezept = new Rezept(this.name, personen, neueZutaten);
        return neuesRezept;
    }
}
