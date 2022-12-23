//Instructions:
//        Write a Java program DecimalToBinary that implements the static method binaryToDecimal() which converts binary number N to its decimal representation. Use Online tool to practice and converting Binary -> Decimals.
//
//        Note: You are not allowed to use a built-in subroutine like Integer.toBinaryString() or similar.
//
//        Sample I/O:
//        student@lab:~$
//        Enter a binary number: 101
//        Decimal of 101 is 5
//        Sample I/O:
//        student@lab:~$
//        Enter a binary number: 1100100
//        Decimal of 1100100 is 100

package Week4;

import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        int decimalNumber = 0;
        while (binaryNumber != 0) {
            int lengthOfNumber = String.valueOf(binaryNumber).length();
            decimalNumber += Math.pow(2, lengthOfNumber - 1);
            binaryNumber -= Math.pow(10, lengthOfNumber - 1);
        }
        return decimalNumber;
    }
}