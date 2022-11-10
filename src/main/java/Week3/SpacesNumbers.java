package Week3;

public class SpacesNumbers {
    public static void main(String[] args) {
        int countLine = 1;
        while (countLine < 6) {
            int countSpace = 5 - countLine;
            int countNumber = countLine;
            while (countSpace != 0) {
                System.out.print(" ");
                countSpace--;
            }
            while (countNumber != 0) {
                System.out.print(countLine);
                countNumber--;
            }
            System.out.println();
            countLine++;
        }
    }
}
