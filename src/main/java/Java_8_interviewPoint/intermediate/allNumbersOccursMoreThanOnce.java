package Java_8_interviewPoint.intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Given a list of integers, find all numbers that occur more than once.
 */
public class allNumbersOccursMoreThanOnce {
    static List<Integer> numbersMoreThanOnceUsingJava8(List<Integer> nums) {
        return nums.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    static List<Integer> numbersMoreThanOnceUsingHashMap(List<Integer> nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

        System.out.println(numbersMoreThanOnceUsingJava8(list));
        System.out.println(numbersMoreThanOnceUsingHashMap(list));
    }
}
