package Week3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the percentage of your grade: ");
        int pass_grade = grade.nextInt();
        if (pass_grade >= 50  && pass_grade <= 100) {
            System.out.println("Passed");
        } else if (pass_grade >= 0 && pass_grade < 50) {
            System.out.println("Failed");
        } else {
            System.out.println("Incorrect grade!");
        }
    }
}
