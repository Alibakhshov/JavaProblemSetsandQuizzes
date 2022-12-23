//Instructions:
//        Write a Java program that accepts an integer ( n ) and computes the value of n+nn+nnn. In case of wrong input, you must print out text "error".
//
//        Input:
//        5
//        Output:
//        5 + 55 + 555 = 615
//
//        input:
//        five
//        Output:
//        error
//
//        Input:
//        -5
//
//        Output:
//        5 + 55 + 555 = 615

package Week6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = Math.abs(input.nextInt());
            String nn = String.valueOf(n) + n;
            String nnn = String.valueOf(n) + n + n;
            System.out.printf("%d + %d%d + %d%d%d = %d", n, n, n, n, n, n, n + Integer.parseInt(nn) + Integer.parseInt(nnn));
        } catch (Exception e) {
            System.out.print("error");
        }

    }
}