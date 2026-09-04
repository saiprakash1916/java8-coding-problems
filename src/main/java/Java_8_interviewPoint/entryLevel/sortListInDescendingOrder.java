package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;

/*
    Write a program to sort a list of integers in descending order using Java 8.
 */
public class sortListInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 3, 6, 1, 8, 5, 9, 10);

        List<Integer> descendingOrder = list.stream()
                .sorted()
                .toList()
                .reversed();

        System.out.println(descendingOrder);
    }
}
