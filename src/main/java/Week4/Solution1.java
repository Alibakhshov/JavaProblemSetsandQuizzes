//Instructions:
//        Write a Java program that implements static method roundSum() so that given 3 ints: a, b, and c; return the sum of their rounded values. We'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
//
//        roundSum(16, 17, 18) → 50
//        roundSum(12, 13, 14) → 40
//        roundSum(6, 4, 4) → 10
//        Input / Output:
//        Enter three integers: 16 17 18
//        Rounded sum is 50
//        Input / Output:
//        Enter three integers: 6 4 4
//        Rounded sum is 10

package Week4;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner roundSum = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num1 = roundSum.nextInt();
        int num2 = roundSum.nextInt();
        int num3 = roundSum.nextInt();
        System.out.printf("Rounded sum is %d", roundSum(num1, num2, num3));
    }

    private static int roundSum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        int lastDigit = sum - ((sum / 10) * 10);
        if (lastDigit >= 5) {
            return (sum / 10) * 10 + 10;
        }
        else {
            return (sum / 10) * 10;
        }
    }
}