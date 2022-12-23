//Instructions:
//        Write a Java static method called wordLengths() that accepts a string. Your method should count the number of letters in each word in the string, and output a result diagram of how many letters contain each word. Use tabs before the asterisks so that they'll line up.
//
//        You may assume that no word in the string is more than 80 characters in length and all words are space-separated.
//
//        Input:
//        Write a method called wordLengths that accepts a string
//        Output:
//        Three columns. The first column contains the order of word in the string (1, 2, 3, etc.) followed by a colon (smile and space. The second column contains the length of the word described by an integer. The 2nd and 3rd columns are separated by a single tab (6 spaces). The third column contains a histogram representing the length of the corresponding word.
//
//        1: 5	*****
//        2: 1	*
//        3: 6	******
//        4: 6	******
//        5: 11	***********
//        6: 4	****
//        7: 7	*******
//        8: 1	*
//        9: 6	*****

package Week5;

import java.util.Scanner;

public class WordLengths {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        wordLengths(inputLine);
    }

    public static void wordLengths(String words) {
        words = words.strip();
        String unnecessarySymbols = ".(){},!\"^/?-@:<[]|*";
        for (int symbolCounter = 0; symbolCounter < unnecessarySymbols.length(); symbolCounter++) {
            words = words.replaceAll(String.valueOf(unnecessarySymbols.charAt(symbolCounter)), "");
        }
        String[] wordsArray = words.split(" ");
        for (int wordCounter = 1; wordCounter < wordsArray.length + 1; wordCounter++) {
            String word = wordsArray[wordCounter - 1];
            String digits = "1234567890";
            for (int digitCounter = 0; digitCounter < unnecessarySymbols.length(); digitCounter++) {
                words = words.replaceAll(String.valueOf(digits.charAt(digitCounter)), "");
            }
            System.out.printf("%d: %d\t%s\n", wordCounter, word.length(), "*".repeat(word.length()));
        }
    }
}
