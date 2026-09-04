package patterns;

import java.util.Scanner;

public class numberPatterns {
    /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
     */
    static void numberIncreasePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */
    static void numberDecreasePattern(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    6 6 6 6 6 6
    7 7 7 7 7 7 7
     */
    static void numberSamePattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    7 7 7 7 7 7 7
    6 6 6 6 6 6
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1
     */
    static void numberSamePatternReverseOrder(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
    7
    7 6
    7 6 5
    7 6 5 4
    7 6 5 4 3
    7 6 5 4 3 2
    7 6 5 4 3 2 1
     */
    static void numberPatterVerticalSameNumber(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = row; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    7 6 5 4 3 2 1
    7 6 5 4 3 2
    7 6 5 4 3
    7 6 5 4
    7 6 5
    7 6
    7
     */
    static void numberPatternDecreasingOrder(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
    6 5 4 3 2 1
    7 6 5 4 3 2 1
     */

    static void numberPatternDecreasingHorizontal(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows you want in this pattern: ");
        int rows = scanner.nextInt();
        System.out.println("Here is your pattern....!!!");
        //numberIncreasePattern(rows);
        //numberDecreasePattern(rows);
        //numberSamePattern(rows);
        //numberSamePatternReverseOrder(rows);
        //numberPatterVerticalSameNumber(rows);
        //numberPatternDecreasingOrder(rows);
        numberPatternDecreasingHorizontal(rows);
    }
}
