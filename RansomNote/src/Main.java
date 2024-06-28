import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String a = "ba";
        String b = "baa";

        System.out.println(isRandsome(a,b));


    }

    public static boolean isRandsome(String a, String b) {
        char[] aArray =a.toCharArray();
        char[] bArray = b.toCharArray();

        Map<Character, Integer> aMap= new HashMap<>();
        Map<Character, Integer> bMap= new HashMap<>();

        for(int i=0; i<aArray.length;i++) {
            aMap.put(aArray[i], aMap.getOrDefault(aArray[i],0)+1);
        }

        for(int i=0; i<bArray.length;i++) {
            bMap.put(bArray[i], bMap.getOrDefault(bArray[i],0)+1);
        }

        for (Character chars: aMap.keySet()) {

            if(aMap.get(chars) ==bMap.get(chars)){
                return true;
            }
        }


        return false;

    }
}