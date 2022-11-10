package Week4;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner primes = new Scanner(System.in);
        int number = primes.nextInt();
        if (number == 2) {
            System.out.print("2 ");
        }
        else {
            for (int counter = 2; counter < number; counter++) {
                if (isPrime(counter)) {
                    System.out.printf("%d ", counter);
                }
            }
        }
    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        boolean output = true;
        for (int counter = 2; counter < num; counter++) {
            if (num % counter == 0) {
                output = false;
                break;
            }
        }
        return output;
    }
}
