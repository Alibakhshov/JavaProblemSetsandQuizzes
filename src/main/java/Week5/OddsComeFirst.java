//Instructions:
//        Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers. The original order of odds and evens must be preserved.
//
//        Input: N (size of an array, where 1 ≤ N ≤ 1000), an array.
//
//        Input:
//        5
//        3 8 47 5 0
//        Output:
//        3 47 5 8 0

package Week5;

import java.util.Scanner;

public class OddsComeFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt(), counter = 0, integerFromInput;
        int[] integers = new int[length], integersWithOddsFirst = new int[length];
        for (int index = 0; index < length; index++) {
            integerFromInput = input.nextInt();
            integers[index] = integerFromInput;
            if (integers[index] % 2 == 1) {
                integersWithOddsFirst[counter] = integers[index];
                counter++;
            }
        }
        for (int index = 0; index < length; index++) {
            if (integers[index] % 2 == 0) {
                integersWithOddsFirst[counter] = integers[index];
                counter++;
            }
        }
        for (int integer: integersWithOddsFirst) {
            System.out.printf("%d ", integer);
        }
    }
}