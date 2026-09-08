package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findSameNumbersFromBothLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> result = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
