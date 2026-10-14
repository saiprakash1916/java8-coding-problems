package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Write a program to sort a list of integers in ascending order using Java 8.
 */
public class sortListInAscendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 3, 6, 1, 8, 5, 9, 10);

        List<Integer> ascendingOrder = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ascendingOrder);
    }
}
