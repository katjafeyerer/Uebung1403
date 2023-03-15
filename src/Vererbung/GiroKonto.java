package Vererbung;

public class GiroKonto extends Konto{
    public GiroKonto(String inhaber, double limit) {
        super(inhaber);

        if(getKontostand() >= limit){
            auszahlen(limit);
        }

    }

}
