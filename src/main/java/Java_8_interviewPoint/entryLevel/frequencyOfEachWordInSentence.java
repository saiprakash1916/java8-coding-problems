package Java_8_interviewPoint.entryLevel;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Find the frequency of each word in a sentence using Java 8
 */
public class frequencyOfEachWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java Spring Boot Java Microservices Spring Boot";

        Map<String, Long> result = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}
