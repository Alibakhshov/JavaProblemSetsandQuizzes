//Instructions:
//        Write a Java program that converts the 100 point grades into the letter grades. Use the below table as a reference.
//
//        Letter Grade        Percentage        GPA
//
//        A                           93-100              4.0
//
//        A−                         90-92                3.67
//
//        B+                         87-89                3.33
//
//        B                           83-86                3.0
//
//        B−                         80-82                2.67
//
//        C+                         77-79                2.33
//
//        C                           70-76                2.0
//
//        D                           60-69                1.0
//
//        F                           0-59                   0.0
//
//        Input :
//        The user enters a grade.
//
//        Output:
//        The program converts the grade into letter and percentage grades.
//
//        Example:
//        >>> 65
//        D 1.0
//        >>> 89
//        B+ 3.33

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
