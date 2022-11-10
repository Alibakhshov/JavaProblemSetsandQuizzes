package Week2;
import java.util.Scanner;

public class test{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word;
        String inverse = "";

        System.out.println("Write a sentence or word: ");

        while (!input.hasNext("[A-Za-z]+")) {
            System.out.println("Not valid! Try again: ");
            input.nextLine();
        }
        word = input.nextLine();

        word = word.replaceAll("\\s+","");
        word = word.toLowerCase();

        int length = word.length();
        length = length - 1;

        for (int i = length; i >= 0; i--) {
            inverse = inverse + word.charAt(i);
        }

        if (word.equals(inverse)) {
            System.out.println("Is a palindrome.");
        } else {
            System.out.println("Is not a palindrome.");
        }

    }
}