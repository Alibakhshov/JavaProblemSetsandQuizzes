//Instructions:
//        Write a Java program that prompts the user to input a 5-digit number and output each digit of a number line by line.
//
//        Note: You might assume that only valid numbers are going to provide as input.
//
//        Requirement: Implement your algorithm using while loop.
//
//        Hint: You might find String's class methods are useful split() and trim().
//
//
//        Input-0:
//        12345
//        Output:
//        1
//        2
//        3
//        4
//        5
//        Input-1:
//        50061
//        Output:
//        5
//        0
//        0
//        6
//        1
//
//        Input-2:
//        9513578264
//        Output:
//        Number is too long!
//
//        Input-3:
//        951
//        Output:
//        Number is too short!

package Week3;

public class NumberDigits {
    public static void main(String[] args) {
        int lineCounter = 1;
        while (lineCounter < 8) {
            int numberCounter = 1;
            while (numberCounter < lineCounter + 1) {
                System.out.print(lineCounter);
                numberCounter++;
            }
            System.out.println();
            lineCounter++;
        }
    }

}
