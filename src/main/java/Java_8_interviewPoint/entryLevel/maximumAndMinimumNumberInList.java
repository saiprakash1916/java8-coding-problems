package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;

/*
    Write a program to find the maximum and minimum number in a list using Java 8 Streams.
 */
public class maximumAndMinimumNumberInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 8, 9, 10, 30, 48);

        int maxValue = list.stream()
                .max(Integer::compare)
                .orElse(0);

        int minValue = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println("Max number is: " + maxValue + " and min number is: " + minValue);
    }
}
