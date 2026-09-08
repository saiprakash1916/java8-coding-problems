package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;

/*
    Find the second-smallest number in a list using Java 8 Streams.
 */
public class secondSmallestNumber {
    static Integer secondSmallestWithSorting(List<Integer> nums){
        return nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    static int secondSmallestWithoutSorting(List<Integer> nums){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if (num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(secondSmallestWithSorting(list));
        System.out.println(secondSmallestWithoutSorting(list));
    }
}
