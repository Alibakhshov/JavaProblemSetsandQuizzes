//Instructions:
//        Write a Java program DecimalToBinary that implements the static method decimalToBinary() which converts decimal number N to its binary representation. Use Online tool to practice and converting Decimals -> Binary.
//
//        Note: You are not allowed to use a built-in subroutine like Integer.toBinaryString().
//
//        Sample I/O:
//        student@lab:~$
//        Enter an integer number: 5
//        Binary of 5 is 00000101
//        Sample I/O:
//        student@lab:~$
//        Enter an integer number: 100
//        Binary of 100 is 01100100

package Week4;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        int binaryNumber = decimalToBinary(decimalNumber);
        if (binaryNumber < 10) {
            System.out.printf("Binary of %d is 0000000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 100) {
            System.out.printf("Binary of %d is 000000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 1000) {
            System.out.printf("Binary of %d is 00000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 10000) {
            System.out.printf("Binary of %d is 0000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 100000) {
            System.out.printf("Binary of %d is 000%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 1000000) {
            System.out.printf("Binary of %d is 00%d", decimalNumber, binaryNumber);
        }
        else if (binaryNumber < 10000000) {
            System.out.printf("Binary of %d is 0%d", decimalNumber, binaryNumber);
        }
        else {
            System.out.printf("Binary of %d is %d", decimalNumber, binaryNumber);
        }
    }

    private static int decimalToBinary(int decimalNumber) {
        int power = 0, binaryNumber = 0, remainder;
        while (decimalNumber != 0) {
            remainder = decimalNumber % 2;
            decimalNumber /= 2;
            if (remainder == 1) {
                binaryNumber += Math.pow(10, power);
            }
            power++;
        }
        return binaryNumber;
    }
}
