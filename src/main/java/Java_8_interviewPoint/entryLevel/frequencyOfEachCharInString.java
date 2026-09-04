package Java_8_interviewPoint.entryLevel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find the frequency of each character in a string using Streams.
 */
public class frequencyOfEachCharInString {
    public static void main(String[] args) {
        String str = "Senior Java Backend Developer";
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
