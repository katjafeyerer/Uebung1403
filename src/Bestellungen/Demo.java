package Bestellungen;

public class Demo {
    public static void main(String[] args) {
        Bestellzeile bz = new Bestellzeile("Hallo", 25, 2);
        bz.getKosten();
        System.out.println(bz.getKosten());

        Bestellzeile bz2 = new Bestellzeile("Ich", 30, 2);

        Bestellzeile[] zeilen = {bz, bz2};
        Bestellung bestellung = new Bestellung("12", zeilen);
        bestellung.printBestellung();

        System.out.println(bestellung.getKosten());
    }
}
