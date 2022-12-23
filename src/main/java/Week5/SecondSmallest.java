//Instructions:
//        Given the size of an array of doubles as N, get all numbers from the user. Afterward, find and output the second smallest element from the array,
//
//        The sample I/O:
//        Enter N: 5
//        1.2
//        0.5
//        1.1
//        5.7
//        10
//        1.1

package Week5;

import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();
        double[] numbersArray = new double[n];
        for (int index = 0; index < n; index++) {
            numbersArray[index] = input.nextDouble();
        }
        double smallestNumber = numbersArray[0], secondSmallestNumber = numbersArray[0];
        for (double number: numbersArray) {
            if (number < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = number;
            } else if (number > smallestNumber && number < secondSmallestNumber) {
                secondSmallestNumber = number;
            }
        }
        System.out.print(secondSmallestNumber);
    }
}
