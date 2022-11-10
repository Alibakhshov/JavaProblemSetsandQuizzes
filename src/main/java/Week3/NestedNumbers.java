package Week3;

public class NestedNumbers {
    public static void main(String[] args) {
        int countLine = 1;
        while (countLine < 4) {
            int countNumber = 1;
            while (countNumber < 10) {
                System.out.print(countNumber);
                System.out.print(countNumber);
                System.out.print(countNumber);
                countNumber++;
            }
            System.out.println();
            countLine++;
        }
    }
}
