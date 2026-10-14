package Java_8_interviewPoint.entryLevel;

import java.util.Scanner;
import java.util.function.Predicate;

/*
     Write a Java 8 program to check whether a given number is even or odd using a lambda expression.
 */
public class evenOrOddUsingLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check even/odd: ");
        int num = scanner.nextInt();
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(num) ? " is Even" : "is Odd");
    }
}
