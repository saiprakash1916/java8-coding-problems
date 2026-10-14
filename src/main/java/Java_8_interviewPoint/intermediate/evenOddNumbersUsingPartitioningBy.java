package Java_8_interviewPoint.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Partition a list of numbers into even and odd numbers using `partitioningBy()`.
 */
public class evenOddNumbersUsingPartitioningBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(
                        i -> i % 2 == 0
                ));

        System.out.println("Even: " + result.get(true));
        System.out.println("Odd: " + result.get(false));

    }
}
