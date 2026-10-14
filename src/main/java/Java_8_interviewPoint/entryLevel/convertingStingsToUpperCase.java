package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Given a list of names, convert all names to uppercase using Streams.
 */
public class convertingStingsToUpperCase {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Gopi", "Sai", "Venkatesh", "Rahul Ravi", "Krishna");

        List<String> result = listOfStrings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
