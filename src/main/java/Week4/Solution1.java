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