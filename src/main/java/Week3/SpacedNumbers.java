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
