package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;

/*
    Write a program to find the sum of all numbers in a list using Streams.
 */
public class sumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all numbers is: " +  sum);
    }
}
