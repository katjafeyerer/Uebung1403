package Vererbung;

public class Konto {
    private String inhaber;
    private double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen(double wert){
        if(wert >= 0){
            kontostand += wert;
            System.out.println(kontostand);
        }

    }
    public void auszahlen(double wert){
        if(wert > 0){
            kontostand -= wert;
            System.out.println(kontostand);
        }
        }

    }

