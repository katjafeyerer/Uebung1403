package KontenOrdner;

public class Konto {
    private String inhaber;
    public double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double wert){
        double newKontostand = 0;
        if(wert >= 0){
            newKontostand = kontostand +wert;
            System.out.println(newKontostand);
            kontostand = newKontostand;
        } else{
            System.out.println("Bitte geben Sie zum Einzahlen einen positiven Wert ein: " + wert);
        }
    }
    public void auszahlen(double wert){
        double newKontostand = 0;
        if(wert >= 0){
            newKontostand = kontostand -wert;
            System.out.println(newKontostand);
            kontostand = newKontostand;
        }else{
            System.out.println("Bitte geben Sie zum Abbuchen einen positiven Wert ein: " + wert);
        }
    }
}
