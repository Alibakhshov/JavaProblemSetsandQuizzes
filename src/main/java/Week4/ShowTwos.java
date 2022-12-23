//Instructions:
//        Write a Java program that implements the method named showTwos that shows the factors of 2 in a given integer. For example, the following calls:
//
//        showTwos(7)
//        showTwos(18)
//        showTwos(68)
//        showTwos(120)
//        Input / Output:
//        $ 7
//        7 = 7
//        Input / Output:
//        $ 18
//        18 = 2 * 9
//        Input / Output:
//        $ 68
//        68 = 2 * 2 * 17
//        Input / Output:
//        120 = 2 * 2 * 2 * 15

package Week4;

import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner showTwos = new Scanner(System.in);
        int number = showTwos.nextInt();
        System.out.print(showTwos(number));
    }

    public static String showTwos(int number){
        int twos = 0, numberCopy = number;
        while (number % 2 == 0) {
            twos++;
            number /= 2;
        }
        StringBuilder twosString = new StringBuilder();
        while (twos > 0) {
            twosString.append("2 * ");
            twos--;
        }
        return String.format("%d = %s * %d", numberCopy, twosString, number);
    }
}