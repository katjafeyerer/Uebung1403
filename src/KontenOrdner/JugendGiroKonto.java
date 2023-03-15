package KontenOrdner;

public class JugendGiroKonto extends GiroKonto{
    private double buchungslimit;


    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
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
        if(wert >= 0 && wert <= this.limit && wert <= this.buchungslimit){
            newKontostand = this.kontostand -wert;
            System.out.println(newKontostand);
            this.kontostand = newKontostand;

        } else{
            System.out.println("Bitte geben Sie zum Abbuchen einen positiven Wert ein: " + wert +
                    " & überschreiten Sie das Limit nicht/ Buchungslimit überschritten");
        }
    }
}
