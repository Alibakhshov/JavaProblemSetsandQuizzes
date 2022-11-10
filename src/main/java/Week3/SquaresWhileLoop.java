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
