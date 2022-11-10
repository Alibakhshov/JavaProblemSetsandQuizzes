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
