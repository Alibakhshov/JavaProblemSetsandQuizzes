package Week3;

public class WaveNumbers40 {
    public static void main(String[] args) {
        int countLine = 1;
        while (countLine < 5) {
            int countCharacter = 0;
            if ((countLine == 1) || (countLine == 4)) {
                while (countCharacter < 40) {
                    System.out.print("-");
                    countCharacter++;
                }
            }
            else if (countLine == 2) {
                while (countCharacter < 40) {
                    switch (countCharacter % 4) {
                        case 0:
                            System.out.print("_");
                            break;
                        case 1:
                            System.out.print("-");
                            break;
                        case 2:
                            System.out.print("^");
                            break;
                        case 3:
                            System.out.print("-");
                            break;
                    }
                    countCharacter++;
                }
            }
            else if (countLine == 3) {
                int countNumber = 1;
                while (countCharacter < 40) {
                    System.out.print(countNumber);
                    System.out.print(countNumber);
                    countNumber++;
                    if (countNumber == 10) {
                        countNumber = 0;
                    }
                    countCharacter += 2;
                }
            }
            System.out.println();
            countLine++;
        }
    }
}
