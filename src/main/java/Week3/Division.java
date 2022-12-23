//Instructions:
//        Write a Java program that returns the result of the division of two numbers that were given by the user. In case of incorrect input, the program must print an error message: “Incorrect input!”.
//
//
//
//        Input:
//        The dividend and divisor are entered by the user on new lines.
//
//        Output:
//        The quotient will be printed in a new line.
//
//        Example:
//
//        >>> Enter a dividend: 63
//        Enter a divisor: 7
//        Quotient is : 9
//        >>> Enter a dividend: 10
//        Enter a divisor: 5
//        Quotient is : 2
//        >>> Enter a dividend: 5
//        Enter a divisor: 0
//        Incorrect input!


        package Week3;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner division = new Scanner(System.in);
        System.out.println("Enter a dividend:");
        int dividend = division.nextInt();
        System.out.println("Enter a divisor:");
        int divisor = division.nextInt();
        if (divisor == 0){
            System.out.println("Incorrect input!");
        }else {
            System.out.println("Quotient is: " + dividend/divisor);;
        }
    }
}
