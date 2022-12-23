//Instructions:
//        Write a Java program that outputs the message “passed” or “failed” based on the user’s input. If the user enters the number in range [50, 100] program must print out the message “passed”, if the number is in the range [0, 50) program prints out the message “failed”, otherwise program must print out “Incorrect grade!”.
//
//        Input :
//        Enters his/her grade.
//
//        Output :
//        Passed, failed, or Incorrect grade!
//
//        Example:
//        >>> 50
//        Passed
//        >>> 15
//        Failed
//        >>> -9
//        Incorrect grade!

package Week3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the percentage of your grade: ");
        int pass_grade = grade.nextInt();
        if (pass_grade >= 50  && pass_grade <= 100) {
            System.out.println("Passed");
        } else if (pass_grade >= 0 && pass_grade < 50) {
            System.out.println("Failed");
        } else {
            System.out.println("Incorrect grade!");
        }
    }
}
