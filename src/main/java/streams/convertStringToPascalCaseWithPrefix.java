package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
        Input -> hello world i am senior java developer

        Output -> #HelloWorldIAmSeniorJavaDeveloper
 */
public class convertStringToPascalCaseWithPrefix {

    static void convertingString(String str){
        StringBuilder result = new StringBuilder("#");

        for (String word : str.split("\\s+")){
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1));
        }

        System.out.println(str + " -> " + result);
    }

    static void convertingStringUsingJava8(String str){

        String result = "#" + Arrays.stream(str.split("\\s+"))
                .map(word -> Character.toUpperCase(word.charAt(0))
                 + word.substring(1))
                .collect(Collectors.joining());

        System.out.println(str + " -> "+ result);
    }

    public static void main(String[] args) {
        String str = "hello world i am senior java developer";

        convertingString(str);
        convertingStringUsingJava8(str);
    }
}
