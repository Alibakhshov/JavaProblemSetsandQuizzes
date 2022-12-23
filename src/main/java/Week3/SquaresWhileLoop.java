//Instructions:
//        Write a Java program that uses the while loop to produce the following output by calculating the squares of the numbers in the range 1 through 10:
//
//        1 4 9 16 25 36 49 64 81 100
//        For an added challenge, try to modify your code so that it does not need to use the * multiplication operator. (It can be done! Hint: Look at the differences between adjacent numbers.)

package Week3;

public class SquaresWhileLoop {
    public static void main(String[] args) {
        int countNumber = 0;
        int numAdd = 3;
        int numSquare = 1;

        while (countNumber < 10) {
            System.out.print(numSquare + " ");
            countNumber++;
            numSquare += numAdd;
            numAdd += 2;
        }
    }
}
