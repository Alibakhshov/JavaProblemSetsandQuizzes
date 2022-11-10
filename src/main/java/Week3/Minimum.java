package Week3;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner minimum = new Scanner(System.in);
        System.out.print(">>>");
        int first_num = minimum.nextInt();
        int second_num = minimum.nextInt();
        int third_num = minimum.nextInt();
        boolean equal = (first_num == second_num && second_num == third_num);
        if (equal) {
            System.out.print("They are all equal");
        }
        else if (first_num <= second_num && first_num <= third_num) {
            System.out.print("The least of these three numbers is " + first_num);
        }
        else if (second_num <= first_num && second_num <= third_num) {
            System.out.print("The least of these three numbers is " + second_num);
        }
        else {
            System.out.print("The least of these three numbers is " + third_num);
        }
    }
}
