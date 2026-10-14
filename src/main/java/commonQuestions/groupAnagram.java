package commonQuestions;

import java.util.*;
import java.util.stream.Collectors;

/*
        Input -> {"eat", "tea", "tan", "ate", "nat", "bat"}
        output -> [[eat, tea, ate], [bat], [tan, nat]]
 */

public class groupAnagram {
    static List<List<String>> groupAnagrams(List<String> str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            map.computeIfAbsent(new String(ch), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    static List<List<String>> groupAnagramsUsingJava8(List<String> str) {
        return new ArrayList<>(
                str.stream()
                        .collect(Collectors.groupingBy(s -> {
                            char[] ch = s.toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        })).values()
        );
    }

    static List<List<String>> groupAnagramsUsingJava8(String[] str) {
        return new ArrayList<>(
                Arrays.stream(str)
                        .collect(Collectors.groupingBy(s -> {
                            char[] ch = s.toCharArray();
                            Arrays.sort(ch);
                            return new String(ch);
                        })).values()
        );
    }

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        System.out.println(groupAnagrams(list));
        System.out.println(groupAnagramsUsingJava8(str));
        System.out.println(groupAnagramsUsingJava8(list));
    }
}
