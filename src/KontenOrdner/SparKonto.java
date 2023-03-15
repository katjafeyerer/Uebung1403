package KontenOrdner;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
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
        if(wert > this.kontostand){
            System.out.println("Bitte überschreiten Sie ihren Kontostand nicht");
        }
        else if(wert >= 0){
            newKontostand = this.kontostand -wert;
            System.out.println(newKontostand);
            this.kontostand = newKontostand;

        } else{
            System.out.println("Bitte geben Sie zum Abbuchen einen positiven Wert ein: " + wert +
                    " & überschreiten Sie das Limit nicht");
        }

    }
}
