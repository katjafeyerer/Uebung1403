package KontenOrdner;

public class Demo {
    public static void main(String[] args) {
        Konto konto = new Konto("Katja");
        konto.einzahlen(100);
        konto.einzahlen(200);
        konto.einzahlen(-100);
        konto.auszahlen(150);
        konto.auszahlen(200);
        konto.auszahlen(-100);

        GiroKonto konto2 = new GiroKonto("Katja", 100);
        konto2.einzahlen(100);
        konto2.auszahlen(120);
        konto2.auszahlen(20);

        JugendGiroKonto jgkonto = new JugendGiroKonto("Katja", 100, 200);
        jgkonto.einzahlen(100);
        jgkonto.auszahlen(20);
        jgkonto.auszahlen(201);

        SparKonto spkonto = new SparKonto("Katja");
        spkonto.einzahlen(100);
        spkonto.auszahlen(20);
        spkonto.auszahlen(10);
        spkonto.auszahlen(70);
        spkonto.auszahlen(10);
    }
}
