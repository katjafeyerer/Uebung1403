package OOP2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Zutat2 mehl = new Zutat2("Mehl", 200);
        Zutat2 zucker = new Zutat2("Zucker", 200);
        Zutat2 salz = new Zutat2("Salz", 200);
        Zutat2 sahne = new Zutat2("Sahne", 200);

        Zutat2[] zutaten = {mehl, zucker, salz, sahne};

        Rezept2 kuchen = new Rezept2("Kuche", 6, zutaten);

        System.out.println(Arrays.toString(zutaten));
        System.out.println();
        kuchen.printRezept();
        //System.out.println(kuchen);

        kuchen.umrechnen(12);
        System.out.println(kuchen.umrechnen(12));
    }
}
