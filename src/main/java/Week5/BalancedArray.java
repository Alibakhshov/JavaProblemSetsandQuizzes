//Instructions:
//        Write a program that takes input 10 integer numbers and stores in an array. Afterward, decide whether this array can be balanced or not an output "Can be balanced" or "Cannot be balanced". An array is balanced if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//
//
//        The sample I/O:
//        Enter 10 numbers:
//
//        1 2 3 4 5 5 4 3 2 1
//
//        Output:
//
//        Can be balanced
//
//        -----------------------
//
//        The sample I/O 2:
//        Enter 10 numbers:
//
//        10 26 8 7 6 5 4 3 2 1
//
//        Can be balanced
//
//        -----------------------
//
//        The sample I/O 3:
//        Enter 10 numbers:
//
//        1 2 3 4 5  5 4 3 2 0
//
//        Can not be balanced
//
//        -----------------------

package Week5;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
            try {
                for (int counter = 0; counter < 10; counter++) {
                    numbers[counter] = input.nextInt();
                }
            int leftSum = 0, rightSum = 1, numberCounter = 0;
            boolean isBalanced = false;
            while (leftSum < rightSum) {
                leftSum = 0;
                rightSum = 0;
                for (int numberCounterCopy = numberCounter; numberCounterCopy >= 0; numberCounterCopy--) {
                    leftSum += numbers[numberCounterCopy];
                }
                for (int numberCounterCopy = numberCounter + 1; numberCounterCopy < numbers.length; numberCounterCopy++) {
                    rightSum += numbers[numberCounterCopy];
                }
                if (leftSum == rightSum) {
                    isBalanced = true;
                    break;
                }
                numberCounter++;
            }
            if (isBalanced) {
                System.out.print("Can be balanced");
            }
            else {
                System.out.print("Can not be balanced");
            }
        } catch (Exception e) {
                System.out.println("Error");
        }
    }
}
