//Instructions:
//        It's common to print a rotating, increasing list of single-digit numbers at the start of a program's output as a visual guide to number the columns of the output to follow. With this in mind, write nested nested-while loops to produce the following output, with each line 60 characters wide
//
//
//        |         |         |         |         |         |
//        123456789012345678901234567890123456789012345678901234567890

package Week3;

public class NumbersOutput60 {
    public static void main(String[] args) {
        int countLine = 0;
        while (countLine < 2) {
            int countCharacter = 0;
            switch (countLine) {
                case 0:
                    while (countCharacter < 60) {
                        if (countCharacter % 10 == 9) {
                            System.out.print("|");
                        }
                        else {
                            System.out.print(" ");
                        }
                        countCharacter++;
                    }
                    break;
                case 1:
                    int countNumber = 1;
                    while (countCharacter < 60) {
                        System.out.print(countNumber);
                        countNumber++;
                        if (countNumber == 10) {
                            countNumber = 0;
                        }
                        countCharacter++;
                    }
                    break;
            }
            System.out.println();
            countLine++;
        }
    }
}
