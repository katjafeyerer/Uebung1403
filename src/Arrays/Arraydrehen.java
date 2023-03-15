package Arrays;

public class Arraydrehen {
    public static void main(String[] args) {
        String[] input = {"Hallo", "Max", "Mustermann"};
        String[] output = {""};

        output = reverseArray(input);
        for (String s: output) {
            System.out.println(s);
        }

    }
    public static String[] reverseArray(String[] arrayToReverse){
        String[] reversed = new String[arrayToReverse.length];
        for (int i = arrayToReverse.length-1, j=0; i>= 0; i--, j++) {
            String text = arrayToReverse[i];
            reversed[j] = text;

        }
        return reversed;
    }
}
