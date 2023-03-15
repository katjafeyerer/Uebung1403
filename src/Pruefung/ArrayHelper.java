package Pruefung;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 2, 4, 3};
        arrangeOrder(numbers);

        System.out.println(Arrays.toString(numbers));



    }
    public static void arrangeOrder(int[] numbers){
        boolean changeNeeded = true;
        while(changeNeeded) {
            changeNeeded = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                int left = numbers[i];
                int right = numbers[i + 1];
                if (left > right) {
                    numbers[i] = right;
                    numbers[i + 1] = left;
                    changeNeeded = true;

                }
            }

        }}
}
