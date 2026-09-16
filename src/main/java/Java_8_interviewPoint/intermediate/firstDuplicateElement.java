package Java_8_interviewPoint.intermediate;

import java.util.*;

/*
    Given a list of integers, find the first duplicate element.
 */
public class firstDuplicateElement {
    static Integer firstDuplicateUsingJava8(List<Integer> nums) {
        Set<Integer> seen = new HashSet<>();

        return nums.stream()
                .filter(num -> !seen.add(num))
                .findFirst()
                .orElse(null);
    }

    static int firstDuplicateWithoutJava8(List<Integer> nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
        System.out.println(firstDuplicateUsingJava8(list));
        System.out.println(firstDuplicateWithoutJava8(list));
    }
}
