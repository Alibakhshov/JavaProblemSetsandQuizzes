//Instructions:
//        Write a Java program that uses the nested-while loops to produce the following output:
//
//        1
//        2
//        3
//        4
//        5

package Week3;

public class SpacedNumbers {
    public static void main(String[] args) {
        int countNumber = 1;
        while (countNumber < 6) {
            int countSpace = 0;
            while ((5 - countNumber) - countSpace > 0) {
                System.out.print(" ");
                countSpace++;
            }
            System.out.println(countNumber);
            countNumber++;
        }
    }
}
