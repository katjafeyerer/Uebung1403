package Strings;

public class Woerter {
    public static void main(String[] args) {
        String input = "Wörter starten mit Großbuchstaben";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(i == 0 || input.charAt(i-1) == ' '){
                c = Character.toUpperCase(c);

            }
            output += c;
        }
        System.out.println(output);
    }



}
