package Strings;

import java.util.Arrays;

public class CSVDemo {
    public static void main(String[] args) {
        CSVParser csv = new CSVParser("Spalte 1, Spalte 2, Spalte 3, Spalte 4,");

        csv.countComma();
        System.out.println(csv.countComma());

        String[] parser = csv.parse();
        for (String s: parser) {
            System.out.println(s);
        }
        System.out.println(parser.toString());
        System.out.println(Arrays.toString(csv.parse()));
    }
}
