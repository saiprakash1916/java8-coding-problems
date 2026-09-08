package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Find all even numbers from a given list using Java 8.
 */
public class AllEvenNumbersFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
