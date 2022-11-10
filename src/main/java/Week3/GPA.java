package Week3;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner gpa = new Scanner(System.in);
        System.out.print(">>> ");
        float grade_perc = gpa.nextFloat();
        if (grade_perc <= 100 && grade_perc >= 93) {
            System.out.print("A 4.0");
        }
        else if (grade_perc <= 92 && grade_perc >= 90) {
            System.out.print("A- 3.67");
        }
        else if (grade_perc <= 89 && grade_perc >= 87) {
            System.out.print("B+ 3.33");
        }
        else if (grade_perc <= 86 && grade_perc >= 83) {
            System.out.print("B 3.0");
        }
        else if (grade_perc <= 82 && grade_perc >= 80) {
            System.out.print("B- 2.67");
        }
        else if (grade_perc <= 79 && grade_perc >= 77) {
            System.out.print("C+ 2.33");
        }
        else if (grade_perc <= 76 && grade_perc >= 70) {
            System.out.print("C 2.0");
        }
        else if (grade_perc <= 69 && grade_perc >= 60) {
            System.out.print("D 1.0");
        }
        else if (grade_perc <= 59 && grade_perc >= 0) {
            System.out.print("F 0.0");
        }
        else {
            System.out.print("Incorrect grade!");
        }
    }
}
