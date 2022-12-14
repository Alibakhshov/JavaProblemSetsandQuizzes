//Instructions:
//        Write a Java program to count the letters, spaces, numbers and other characters of an input string.
//        Input:
//        The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//        Output:
//        letter: 34
//        space: 14
//        number: 10
//        other: 7

package Week5;

import java.util.Scanner;

public class LettersSpacesNumbers {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (int characterIndex = 0; characterIndex < inputLine.length(); characterIndex++) {
            if (Character.isAlphabetic(inputLine.charAt(characterIndex))) {
                letters++;
            }
            else if (inputLine.charAt(characterIndex) == ' ') {
                spaces++;
            }
            else if (Character.isDigit(inputLine.charAt(characterIndex))) {
                numbers++;
            }
            else {
                others++;
            }
        }
        System.out.printf("letter: %d%nspace: %d%nnumber: %d%nother: %d", letters, spaces, numbers, others);
    }
}
