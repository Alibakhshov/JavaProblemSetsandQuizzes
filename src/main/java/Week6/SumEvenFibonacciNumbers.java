//Instructions:
//        Write a Java method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci numbers that are less than or equal to n. Each new element in the Fibonacci sequence is generated by adding the previous two elements.
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//        Constraints:
//        The following constraint applies for the input integer number n: 1<n≤1000
//
//        Even though the classic Fibonacci sequence starts with the first two integers: 1 and 1, in the given problem, the Fibonacci sequence starts with 1 and 2.
//
//
//
//        Input-1:
//        5
//        Output:
//        2
//        Input-2:
//        13
//        Output:
//        10
//        Input-3:
//        100
//        Output:
//        144

package Week6;

import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number1 = 1, number2 = 1, temporary, result = 0;
        while (number2 <= n) {
            if (number2 % 2 == 0) {
                result += number2;
            }
            temporary = number2;
            number2 += number1;
            number1 = temporary;
        }
        System.out.print(result);
    }
}