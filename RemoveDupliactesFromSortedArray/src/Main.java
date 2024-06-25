public class Main {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] output = removeDuplicates(array);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }


    public static int[] removeDuplicates(int[] nums) {

        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return nums;
    }
}