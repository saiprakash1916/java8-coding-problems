package commonQuestions;

import java.util.HashMap;
import java.util.Map;

public class findFirstNonRepeatingChar {
    static Character nonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "aabbcdde";
        System.out.println(nonRepeatingChar(str));
    }
}
