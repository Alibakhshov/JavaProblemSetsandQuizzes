//Instructions:
//        Develop with Java programming language a calculator (console application) that takes a number, a basic math operator ( + , - , * , / , % ), and a second number all from user input, and have it print the result of the mathematical operation. The mathematical operations should be wrapped inside of functions.
//
//        Note: Do please use the provided source code template to implement your solution. The purpose of this problem is not only to assess the students' ability to build a valid implementation but also to assess the ability to read the Java code.
//
//        Input:
//        On single line a number, a basic math operator ( + , - , * , / , % ), and a second number all from user input.
//
//        Output:
//        On new line result of the mathematical operation. In the case of "Division by zero" you must printout the text message "Error".
//
//        Example 1:
//        lab@pc:~$ 4 + 8
//        12
//        Example 2:
//        lab@pc:~$ 4 * 8
//        32
//        Example 3:
//        lab@pc:~$ 4 % 2
//        0
//        Example 4:
//        lab@pc:~$ 4 / 0
//        Error

package Week6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String[] expression = input.nextLine().strip().split(" ");
        int operand1 = Integer.parseInt(expression[0]), operand2 = Integer.parseInt(expression[2]);
        switch (expression[1]) {
            case "+":
                System.out.println(addition(operand1, operand2));
                break;
            case "-":
                System.out.println(subtraction(operand1, operand2));
                break;
            case "*":
                System.out.println(multiplication(operand1, operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println(division(operand1, operand2));
                }
                break;
            case "%":
                if (operand2 == 0) {
                    System.out.println("Error");
                }
                else {
                    System.out.println(remainder(operand1, operand2));
                }
                break;
        }
    }

    private static int addition(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    private static int division(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static int remainder(int dividend, int divisor) {
        return dividend % divisor;
    }
}