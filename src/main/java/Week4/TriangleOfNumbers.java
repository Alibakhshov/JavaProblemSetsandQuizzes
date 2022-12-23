//Instructions:
//        Write a Java program that implements the static method printTriangle() which receives an integer N as an argument, and prints a triangle until N in the format shown below.
//
//        Sample I/O:
//        Enter N: 5
//        1
//        12
//        123
//        1234
//        12345
//
//        Sample I/O:
//
//        Enter N: 3
//        1
//        12
//        123

package Week4;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner triangleOfNumbers = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = triangleOfNumbers.nextInt();
        System.out.println();
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int counter = 1; counter <= n; counter++) {
            for (int spaceCounter = 0; spaceCounter < n - counter; spaceCounter++) {
                System.out.print(" ");
            }
            for (int numberCounter = 1; numberCounter <= counter; numberCounter++) {
                System.out.print(numberCounter);
            }
            System.out.println();
        }
    }
}

