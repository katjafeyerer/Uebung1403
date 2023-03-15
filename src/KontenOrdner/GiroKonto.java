package KontenOrdner;

public class GiroKonto extends Konto{
    public double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void einzahlen(double wert){
        double newKontostand = 0;
        if(wert >= 0){
            newKontostand = this.kontostand +wert;
            System.out.println(newKontostand);
            this.kontostand = newKontostand;

        } else{
            System.out.println("Bitte geben Sie zum Einzahlen einen positiven Wert ein: " + wert);
        }
    }
    public void auszahlen(double wert){
        double newKontostand = 0;
        if(wert >= 0 && wert <= limit){
            newKontostand = this.kontostand -wert;
            System.out.println(newKontostand);
            this.kontostand = newKontostand;

        } else{
            System.out.println("Bitte geben Sie zum Abbuchen einen positiven Wert ein: " + wert +
                    " & überschreiten Sie das Limit nicht");
        }
        }
    }

