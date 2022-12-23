//Instructions:
//        Write a program that takes input 10 integer numbers and stores in an array. Afterward, count the series of 2 or more adjacent elements in an array and output that number. In cases when input:
//
//        size is not 10 or
//        all not integers
//        your must print out an "error" message.
//
//        Sample I/O 1:
//        Enter 10 numbers:
//
//        1 1 2 2 5 5 4 3 2 1
//
//        3
//
//        -----------------------
//
//        Sample I/O 2:
//        Enter 10 numbers:
//
//        1 1 1 1 1 2 1 1 1 1
//
//        Output:
//
//        2
//
//        -----------------------
//
//        Sample I/O 3:
//        Enter 10 numbers:
//
//        1 1 1 1 1 1 1 1 1 1
//
//        Output:
//
//        1
//
//        -----------------------

package Week5;

import java.util.Scanner;

public class AdjacentArrayElements {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String[] integersStringArray = input.nextLine().strip().split(" ");
        if (integersStringArray.length != 10) {
            System.out.print("Error");
        } else {
            try {
                int[] integersArray = new int[10];
                for (int counter = 0; counter < 10; counter++) {
                    integersArray[counter] = Integer.parseInt(integersStringArray[counter]);
                }
                int result = 0;
                for (int index = 0; index < 10;) {
                    int numberOfAdjacentElements = 0;
                    int adjacentElement = integersArray[index];
                    while (adjacentElement == integersArray[index]) {
                        numberOfAdjacentElements++;
                        index++;
                        if (index == 10) {
                            break;
                        }
                    }
                    if (numberOfAdjacentElements > 1) {
                        result++;
                    }
                }
                System.out.print(result);
            } catch (Exception e) {
                System.out.print("Error");
            }
        }
    }
}
