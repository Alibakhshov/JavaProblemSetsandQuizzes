//Instructions:
//        Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. For example, digitSum(29107) returns 19 (2+9+1+0+7). For negative numbers, return the same value that would result if the number were positive. For example, digitSum(-456) returns 15 (4+5+6). Assume that the maximum length of an input number is 10. In case of wrong input, you must print out text "error".
//
//        Input:
//        25
//        Output:
//        7

package Week5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        try {
            long integer = Math.abs(input.nextLong());
            int sumOfDigitsInInteger = digitSum(integer);
            System.out.print(sumOfDigitsInInteger);
        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public static int digitSum(long integer) {
        String integerString = String.valueOf(integer);
        int sumOfDigits = 0;
        for (int index = 0; index < integerString.length(); index++) {
            sumOfDigits += integerString.charAt(index) - 48;
        }
        return sumOfDigits;
    }
}
