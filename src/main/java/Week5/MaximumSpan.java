//Instructions:
//        Consider the leftmost and rightmost appearances of some value in an array. Span is the count of all the elements between two repeating elements including the repeated elements. Implement the Java static method maxSpan() that returns the maximum span from the received array of integers.
//
//        The return type is an integer.
//
//        A single value has a span of 1. Returns the largest span found in the given array.
//        Sample Input / Output:
//        1 2 1 1 3
//        4
//        Sample Input / Output:
//        1 4 2 1 4 1 4
//        6
//        Sample Input / Output:
//        1 2 3 4 1
//        5

package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSpan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] integersStringArray = input.nextLine().strip().split(" ");
        int[] integersArray = new int[integersStringArray.length];
        for (int index = 0; index < integersStringArray.length; index++) {
            integersArray[index] = Integer.parseInt(integersStringArray[index]);
        }
        System.out.print(maxSpan(integersArray));
    }

    private static int maxSpan(int[] numbers) {
        int maximumSpan = 1;
        for (int startIndex = 0; startIndex < numbers.length - 1; startIndex++) {
            for (int lastIndex = numbers.length - 1; lastIndex >= 0; lastIndex--) {
                if (numbers[startIndex] == numbers[lastIndex]) {
                    if (startIndex == lastIndex) {
                        break;
                    }
                    if (lastIndex - startIndex + 1> maximumSpan) {
                        maximumSpan = lastIndex - startIndex + 1;
                    }
                    break;
                }
            }
        }
        return maximumSpan;
    }
}