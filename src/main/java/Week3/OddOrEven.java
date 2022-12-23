//Instructions:
//        Write a Java program that asks a user to enter a number and prints out if it is odd or even.
//
//        Input:
//        A user enters any number.
//
//        Output:
//        'This number is odd' or 'This number is even'.
//
//        Example:
//        >>>
//        12
//        This number is even
//        >>>
//        19
//        This number is odd
//        >>>
//        0
//        0 is not odd nor even

package Week3;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner typeOfNumber = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int oddOrEven = typeOfNumber.nextInt();
        if (oddOrEven % 2 == 1){
            System.out.println("This number is odd");
        } else if (oddOrEven == 0) {
            System.out.println("0 is not odd nor even");

        }else {
            System.out.println("This number is even");
        }
    }
}
