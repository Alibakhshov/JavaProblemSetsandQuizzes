//Instructions:
//        Write a Java program that asks a user to enter a time of the day (integer number from 0 to 24).  If time is between 0 and 5, the program prints "Good night!". If time is less than 10:00, then print “Good morning!”. If time is less than 20:00, then print “Good day!”, otherwise it prints “Good evening!”.
//
//        Input :
//        A user enters an integer.
//
//        Output:
//        According to the time, it will print messages(Good day! Good evening! Good night!)
//
//        Example:
//        >>>
//        12
//        Good day!
//        >>>
//        2
//        Good night!
//        >>>
//        -9
//        Not acceptable time.

package Week3;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = time.nextInt();
        if (number >= 0 && number <= 5){
            System.out.println("Good night!");
        } else if (number > 5 && number < 10) {
            System.out.println("Good Morning!");
        }else if (number >= 10 && number < 20) {
            System.out.println("Good day!");
        }else if (number >= 20 && number <= 24) {
            System.out.println("Good evening!");
        }else {
            System.out.println("Not acceptable time.");
        }
    }
}
