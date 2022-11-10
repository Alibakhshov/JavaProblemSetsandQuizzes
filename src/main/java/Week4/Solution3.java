package Week4;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner longWords = new Scanner(System.in);
        int n = longWords.nextInt();
        for (int counter = 0; counter < n; counter++) {
            String word = longWords.next();
            System.out.println(abbreviate(word));
        }
    }

    private static String abbreviate(String word) {
        if (word.length() <= 10) {
            return word;
        }
        else {
            String abbreviatedWord = "";
            abbreviatedWord += word.charAt(0);
            abbreviatedWord += String.valueOf(word.length() - 2);
            abbreviatedWord += word.charAt(word.length() - 1);
            return abbreviatedWord;
        }
    }
}
