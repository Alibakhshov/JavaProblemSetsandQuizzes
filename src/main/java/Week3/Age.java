//Instructions:
//        Write a Java program that asks a user to enter his/her age. If the user's age is in the range of [18, 150] (18 ≤ age ≤ 150), program prints “Old enough!”,  when the given age is smaller than the given range it must print “Too young”, and otherwise prints "Incorrect age."
//
//        Example 1:
//        >>>
//        25
//        Old enough!
//        >>>
//        12
//        Too young.
//        >>>
//        -5
//        Incorrect age.
//        >>>
//        151
//        Incorrect age.

package Week3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age_inp = age.nextInt();
        if (age_inp >= 18 && age_inp <= 150){
            System.out.println("Old enough!");
        } else if (age_inp < 18 && age_inp > 0) {
            System.out.println("Too young");
        }else{
            System.out.println("Incorrect age");
        }
    }
}