package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Write a program to remove duplicate elements from a list using Streams.
 */
public class removeDuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
