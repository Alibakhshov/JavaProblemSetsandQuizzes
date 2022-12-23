//Instructions:
//        Write a function that returns an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter but has to arranged in order of appearance in the original array. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. In case when inputs are not integers, you must output the "input error" message. You may modify and return the given array or make a new array. The input size <= 100.
//
//
//        zeroFront ( [1, 0, 0, 1] ) → [0, 0, 1, 1]
//        zeroFront ( [0, 1, 1, 0, 1] ) → [0, 0, 1, 1, 1]
//        zeroFront ( [1, 0] ) → [0, 1]
//        Input:
//        ghost@pc:~$
//        1 0 0 1
//        Output:
//        0 0 1 1

package Week5;

import java.util.Scanner;

public class ZeroFront {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArray = input.nextLine().strip().split(" ");
        int[] outputArray = new int[inputArray.length];
        int lastIndex = outputArray.length - 1, counterForOutputArray = 0;
        try {
            for (int counter = inputArray.length - 1; counter >= 0; counter--) {
                if (!inputArray[counter].equals("0")) {
                    outputArray[lastIndex - counterForOutputArray] = Integer.parseInt(inputArray[counter]);
                    counterForOutputArray++;
                }
            }
            for (int integer : outputArray) {
                System.out.printf("%d ", integer);
            }
        } catch (Exception e) {
            System.out.print("Input error");
        }
    }
}