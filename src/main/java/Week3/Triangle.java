//Instructions:
//        Write a Java program that asks a user to enter the three angles of a triangle. If the sum of three angles entered is equal to 180, then prints out “It is a valid triangle.”, otherwise "It is not a valid triangle."
//
//        Example 1:
//        >>>
//        60
//        80
//        40
//        It is a valid triangle.
//        Example 2:
//        >>>
//        90
//        90
//        0
//        It is not a valid triangle.

package Week3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter an angle for side a:");
        int a = triangle.nextInt();
        System.out.println("Enter an angle for side b:");
        int b = triangle.nextInt();
        System.out.println("Enter an angle for side c:");
        int c = triangle.nextInt();
        int res = a + b + c;
        if (res == 180 && a != 0 && b != 0 && c != 0) {
            System.out.println("It is a valid triangle.");
        }else {
            System.out.println("It is not a valid triangle.");
        }
    }
}
