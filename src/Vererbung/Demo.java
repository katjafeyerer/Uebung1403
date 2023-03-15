package Vererbung;

public class Demo {
    public static void main(String[] args) {
        Konto katja = new Konto("Katja");
        katja.einzahlen(10);
        katja.einzahlen(20);
        katja.auszahlen(50);
        System.out.println("Aktueller Kontostand " + katja.getKontostand());

        GiroKonto konto = new GiroKonto("Katja", 1000);
        konto.einzahlen(100);
        konto.auszahlen(10);
    }

}
