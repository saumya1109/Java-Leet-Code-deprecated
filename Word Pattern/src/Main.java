import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        boolean out = wordMatchesIndex(pattern, s);
        System.out.println(out);


    }

    public static boolean findWordPattern(String pattern, String s) {

        //using sets, but it won't allow pattern=abba ;string = dog dog dog dog
        //Splitted the string based on spaces
        String[] array = s.split(" ");

        Map<String, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        if (pattern.length() != array.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(array[i]) && !set.contains(pattern.charAt(i))) {
                map.put(array[i], pattern.charAt(i));
                set.add(pattern.charAt(i));
            } else if (map.containsKey(array[i])) {
                if (map.get(array[i]) == pattern.charAt(i)) {
                    continue;
                }
            } else {
                return false;
            }
        }

        return true;

    }

    public static boolean wordMatchesIndex(String pattern, String s) {


        String[] array = s.split(" ");

        if (pattern.length() != array.length) return false;

        Map<Character, String> charToString = new HashMap<>();
        Map<String, Character> stringToChar = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            char c = pattern.charAt(i);
            String word = array[i];

            if (!charToString.containsKey(c)) {
                charToString.put(c, word);
            } else if (!charToString.get(c).equals(word)) {
                return false;
            }

            if (!stringToChar.containsKey(word)) {
                stringToChar.put(word, c);
            } else if (!stringToChar.get(word).equals(c)) {
                return false;
            }
        }

        return true;


    }
}