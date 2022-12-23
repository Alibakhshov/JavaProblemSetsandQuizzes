//Instructions:
//        Write a Java program that asks a user to enter three numbers and print out the least one.
//
//        Input :
//        User enters three numbers a,b,c .
//
//        Output :
//        The program prints the least of these three numbers.
//
//        Example 1:
//        >>>
//        56
//        25
//        32
//        The least of these three numbers is 25
//
//
//        Example 2:
//        >>>
//        56
//        56
//        56
//        They are all equal

package Week3;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner minimum = new Scanner(System.in);
        System.out.print(">>>");
        int first_num = minimum.nextInt();
        int second_num = minimum.nextInt();
        int third_num = minimum.nextInt();
        boolean equal = (first_num == second_num && second_num == third_num);
        if (equal) {
            System.out.print("They are all equal");
        }
        else if (first_num <= second_num && first_num <= third_num) {
            System.out.print("The least of these three numbers is " + first_num);
        }
        else if (second_num <= first_num && second_num <= third_num) {
            System.out.print("The least of these three numbers is " + second_num);
        }
        else {
            System.out.print("The least of these three numbers is " + third_num);
        }
    }
}
