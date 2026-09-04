package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;

/*
    Find the first element in a list using Java 8 Streams.
 */
public class firstElementInStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int result = list.stream()
                .findFirst()
                .orElse(0);

        System.out.println(result);
    }
}
