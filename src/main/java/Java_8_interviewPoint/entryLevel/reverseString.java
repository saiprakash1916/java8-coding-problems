package Java_8_interviewPoint.entryLevel;

import java.util.stream.Collectors;

/*
    Reverse a string using Java 8.
 */
public class reverseString {
    public static void main(String[] args) {
        String str = "Hello world";
        String result = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);

        System.out.println(result);
    }
}
