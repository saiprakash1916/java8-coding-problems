package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
    Write a program to find the average of numbers in a list using Java 8.
 */
public class averageOfNumbersInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of numbers is: " + average);
    }
}
