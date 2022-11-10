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
