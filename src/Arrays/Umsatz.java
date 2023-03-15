package Arrays;

public class Umsatz {
    public static void main(String[] args) {
        double[] umsaetze = {12, 4, 6, 34, 45, 67,32};

        getUmsatzsteigerungGT10(umsaetze);
        System.out.println(getUmsatzsteigerungGT10(umsaetze));

        double[][] umsaetzeProMonat =
                        {{12, 34, 23, 45},
                        {23, 45, 56, 76},
                        {3, 56, 67, 34},
                        {23, 56, 67, 34}
        };

    }public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int count = 0;
        for (int i = 0; i < umsaetze.length-1; i++) {
            double vormonat = umsaetze[i];
            double monat = umsaetze[i+1];
            if((vormonat*monat)-100 > 10){
                count++;
            }
        }
        return count;
    }

}
