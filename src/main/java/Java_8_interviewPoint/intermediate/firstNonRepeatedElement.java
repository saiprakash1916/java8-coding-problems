package Java_8_interviewPoint.intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Given a list of integers, find the first non-repeated element.
 */
public class firstNonRepeatedElement {
    static Integer nonReplatedUsingJava8(List<Integer> nums) {
        return nums.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    static int nonReplatedWithOutUsingJava8(List<Integer> nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer num : nums){
            if (map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(nonReplatedUsingJava8(list));
        System.out.println(nonReplatedWithOutUsingJava8(list));
    }
}
