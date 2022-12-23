//Instructions:
//        Given N as an input integer, print a triangle from N until 1. For anything other than int input, print the "Incorrect input" message.
//
//        Constraints:
//        The input integer number is constrained by the following range: 1≤n≤30
//
//        Sample I/O:
//        Enter N: 5
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//        Sample I/O:
//        Enter N: five
//        Incorrect input

package Week6;

import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        try {
            int n = input.nextInt();
            for (int outerCounter = n; outerCounter > 0; outerCounter--) {
                for (int spaceCounter = n - outerCounter; spaceCounter > 0; spaceCounter--) {
                    System.out.print("  ");
                }
                for (int innerCounter = 1; innerCounter <= outerCounter; innerCounter++) {
                    System.out.print(innerCounter + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
    }
}
