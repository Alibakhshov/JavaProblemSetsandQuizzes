//Instructions:
//        Write a Java program that takes a sequence of integer numbers and N as input from the user and prints out a modified version of the sequence as right-shifted by N. You must stop getting input from the user when he/she enters an empty string (Return). You should also handle inputs that are not numbers. Use arrays and methods.
//
//        Sample I/O:
//        Input:
//        Enter your numbers, press return to end.
//        6
//        2
//        hello
//        Not a legal number. Try again!
//        5
//        3
//        10
//        8
//        Enter N:
//        2
//        Output:
//        10, 8, 6, 2, 5, 3

package Week5;

import java.util.Scanner;
import java.util.ArrayList;

public class ShiftRight {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers, press return to end.");
        ArrayList<Integer> numbersArray = new ArrayList<>();
        String numberString = "Not Empty";
        while (!numberString.isEmpty()) {
            try {
                numberString = input.nextLine();
                int number = Integer.parseInt(numberString);
                numbersArray.add(number);
            } catch (Exception e) {
                if (!numberString.isEmpty()) {
                    System.out.println("Not a legal number. Try again!");
                }
            }
        }
        System.out.println("Enter N:");
        int totalShifts = input.nextInt();
        if (numbersArray.size() > 0) {
            for (int shiftCounter = 0; shiftCounter < totalShifts; shiftCounter++) {
                int lastItem = numbersArray.get(numbersArray.size() - 1);
                numbersArray.remove(numbersArray.size() - 1);
                numbersArray.add(0, lastItem);
            }
            for (int number: numbersArray) {
                if (number == numbersArray.get(numbersArray.size() - 1)) {
                    System.out.print(number);
                }
                else {
                    System.out.printf("%d, ", number);
                }
            }
        }
    }
}
