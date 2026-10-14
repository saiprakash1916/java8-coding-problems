package Java_8_interviewPoint.entryLevel;

import java.util.stream.IntStream;

/*
    Check whether a string is a palindrome using Java 8.
 */
public class stringPalindrome {
    static void stringPalindromeUsingJava8(String str){
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

        System.out.println(isPalindrome);
    }

    static boolean stringPalindromeUsingTwoPointers(String str){
        int left = 0, right = str.length() - 1;
        while(left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        stringPalindromeUsingJava8(str);
        System.out.println(stringPalindromeUsingTwoPointers(str));
    }
}
