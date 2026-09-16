package Java_8_interviewPoint.intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
       Find the frequency of each number in a list using `Collectors.groupingBy()`.
 */
public class frequencyOfEachNumber {
    static Map<Integer, Long> frequencyCountUsingJava8(List<Integer> nums) {
        return nums.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    static String frequencyCountWithoutJava8(List<Integer> nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.toString();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 1, 2, 4);
        System.out.println(frequencyCountUsingJava8(list));
        System.out.println(frequencyCountWithoutJava8(list));
    }
}
