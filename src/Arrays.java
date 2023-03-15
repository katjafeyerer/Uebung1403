public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 2, 4, 1};
        isSortedArray(numbers);
        System.out.println(isSortedArray(numbers));

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(isSortedArray(array));

        System.out.println();
        removeDuplicates(numbers);
        System.out.println();
    }
    public static boolean isSortedArray(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            int left = numbers[i];
            int right = numbers[i+1];
            if(left > right){
                return false;
            }
        }
        return true;
    }
    public static int[] removeDuplicates(int[] numbers){
        int[] numbersNeu = new int[numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            int left = numbers[i];
            int right = numbers[i+1];
            if(left > right){
                right = numbers[i];
                left = numbers[i+1];
            }
        }
        return numbersNeu;
    }
}
