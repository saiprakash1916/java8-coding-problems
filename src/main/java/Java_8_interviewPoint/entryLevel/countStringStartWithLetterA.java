package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, count how many strings start with the letter `"A"`.
 */
public class countStringStartWithLetterA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Andhra", "Amalapuram", "Arunachal", "Hyderabad", "Tamil Nadu", "Kerala");

        List<String> result = list.stream()
                .filter(str -> str.startsWith("A"))
                .collect(Collectors.toList());

        long count = list.stream()
                        .filter(str -> str.startsWith("A"))
                .count();

        System.out.println(result);
        System.out.println(count);
    }
}
