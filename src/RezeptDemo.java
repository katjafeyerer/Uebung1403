public class RezeptDemo {
    public static void main(String[] args) {
        Zutat mehl = new Zutat("Mehl", 200);
        Zutat zucker = new Zutat("Zucker", 200);
        Zutat salz = new Zutat("Salz", 200);
        Zutat eis = new Zutat("Eis", 200);
        Zutat sahne = new Zutat("Sahne", 200);

        Zutat[] zutaten = {mehl, zucker, salz, eis, sahne};
        Rezept rezept = new Rezept("Eiskuchen", 2, zutaten);

        rezept.printRezept();

        rezept.umrechnen(6);
        System.out.println(rezept.umrechnen(6));

    }
}
