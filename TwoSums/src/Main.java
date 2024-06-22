import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 9, 7, 14};
        int target = 9;

        //Brute Force Approach

/*        A really brute force way would be to search for all possible pairs of numbers but that would be too slow.
          Again, it's best to try out brute force solutions for just for completeness. */
        int[] output = twoSumsBF(array, target);
        System.out.println(output[0] + " " + output[1]);


/*        So, if we fix one of the numbers, say x, we have to scan the entire array to
        find the next number y which is value - x where value is the input parameter.*/

        int[] output1 = twoSumsComplement(array, target);
        System.out.println(output1[0] + " " + output1[1]);

    }

    public static int[] twoSumsBF(int[] array, int target) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }

    public static int[] twoSumsComplement(int[] array, int target) {
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i< array.length;i++) {
            map.put(array[i],i);
        }

        for(Integer num : map.keySet() ) {
            int complement = target-num;
            if(map.containsKey(complement)) {
                return new int[]{map.get(num), map.get(complement)};
            }
        }
        return new int[]{};
    }
}