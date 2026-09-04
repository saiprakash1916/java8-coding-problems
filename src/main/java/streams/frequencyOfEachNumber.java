package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequencyOfEachNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 40, 50, 60, 60, 10);

        Map<Integer, Long> count = numbers.stream()
                .collect(Collectors.groupingBy(
                        num -> num, Collectors.counting()
                ));

        System.out.println(count);
    }
}
