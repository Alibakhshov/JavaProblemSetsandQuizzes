//Instructions:
//        Write a Java program that uses the while loop to produce the following output:
//
//        12345
//        12345
//        12345
//        12345
//        Optional Challenge:Try to generate the output using nested-while loops.

package Week3;

public class NumbersSquare {
    public static void main(String[] args) {
        int countLine = 1;
        while (countLine < 5) {
            int countNumber = 1;
            while (countNumber < 6) {
                System.out.print(countNumber);
                countNumber++;
            }
            System.out.println();
            countLine++;
        }
    }
}
