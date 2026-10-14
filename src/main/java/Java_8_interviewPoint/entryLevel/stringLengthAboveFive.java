package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of strings, find all strings whose length is greater than 5.
 */
public class stringLengthAboveFive {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Gopi", "Sai", "Venkatesh", "Rahul Ravi", "Krishna");

        List<String> result = listOfStrings.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
