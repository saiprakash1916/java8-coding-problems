package commonQuestions;

import java.util.Scanner;

public class primeNumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the last Number: ");
        int num2 = scanner.nextInt();
        for (int n = num1; n <= num2; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
            }
        }
    }
}
