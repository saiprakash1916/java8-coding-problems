package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Find the second-largest number in a list using Java 8 Streams.
 */
public class secondLargestNumber {

    static Integer secondLargetWithSorting(List<Integer> nums) {
        return nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    static int secondLargestWithoutSorting(List<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(secondLargetWithSorting(list));
        System.out.println(secondLargestWithoutSorting(list));
    }
}
