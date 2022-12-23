//Instructions:
//        Write a Java program that implements the function named zeroEnd so that it returns an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the end of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {1 ,1, 0, 0}. n case when inputs are not integers, you must output the "Input error" message. You may modify and return the given array or make a new array. The input size <= 100.
//
//
//        zeroEnd ( [1, 0, 0, 1] ) → [1, 1, 0, 0]
//        zeroEnd ( [0, 1, 1, 0, 1] ) → [1, 1, 1, 0, 0]
//        zeroEnd ( [0, 1] ) → [1, 0]
//        Input:
//        ghost@pc:~$
//        1 0 0 1
//        Output:
//        1 1 0 0

package Week5;

import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().strip().split(" ");
        int[] outputArray = new int[inputArray.length];
        try {
            int outputArrayCounter = 0;
            for (String integer: inputArray) {
                if (!integer.equals("0")) {
                    outputArray[outputArrayCounter] = Integer.parseInt(integer);
                    outputArrayCounter++;
                }
            }
            for (int integer: outputArray) {
                System.out.printf("%d ", integer);
            }
        } catch (Exception e) {
            System.out.print("Input error");
        }
    }
}
