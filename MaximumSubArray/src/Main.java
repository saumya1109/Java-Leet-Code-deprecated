public class Main {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaxSubarray(array));

    }

    public static int findMaxSubarray(int[] array) {
        int max = 0;
        int currentTotal = 0;
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            currentTotal = 0;
            for (int j = i; j < length; j++) {

                currentTotal += array[j];
                if (max < currentTotal) {
                    max = currentTotal;
                }
            }

        }
        return max;


    }
}