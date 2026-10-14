package Java_8_interviewPoint.entryLevel;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find the first non-repeated character in a string using Java 8.
 */
public class nonRepeatedCharInString {
    public static void main(String[] args) {
        String string = "Hello";
        Character result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())
                ).entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
