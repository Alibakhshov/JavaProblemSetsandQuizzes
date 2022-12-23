//Instructions:
//        Write a Java program Factorials that implements the static method factorialOfN() that evaluates the factorials of the integers from 1 to input N. Factorials are used frequently in probability problems. The n! - factorial of a positive integer n (written and pronounced “n factorial”) is equal to the product of the positive integers from 1 to n. Display the results in tabular format. More about factorials here.
//
//
//        Hints:
//
//        Use for loops in this exercise to print the rows.
//        Use a separate method to compute the factorial of N.
//        Column items are separated by a single tab (4 spaces).
//        The sample I/O:
//        student@lab:~$
//        Enter an integer number: 5
//        X    X!
//        0    1
//        1    1
//        2    2
//        3    6
//        4    24
//        5    120

package Week4;
import java.util.Scanner;
public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        if (n >= 0) {
            System.out.println("\nX\tX!");

            for (int counter = 0; counter <= n; counter++) {
                System.out.printf("%d\t%d%n", counter, factorialOfN(counter));
            }
        }
        else {
            System.out.print("Incorrect input!");
        }
    }

    private static long factorialOfN(int n) {
        long result = 1;
        if (n == 0) {
            return result;
        }
        else {
            int counter = 1;
            while (counter <= n) {
                result *= counter;
                counter++;
            }
            return result;
        }
    }
}
