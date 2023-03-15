package OOP;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Zutat mehl = new Zutat("Mehl", 150);
        Zutat zucker = new Zutat("Zucker", 150);
        Zutat salz = new Zutat("Salz", 150);
        Zutat sahne = new Zutat("Sahne", 150);


        Zutat[] zutaten = {mehl, zucker, salz, sahne};
        Rezept kuchen = new Rezept("Omas Kuchen", 6, zutaten);

        kuchen.printRezept();

        kuchen.umrechnen(12);
        System.out.println(kuchen.umrechnen(12));


    }
}
