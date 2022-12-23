//Instructions:
//        Ask a user to enter a letter. If the entered letter is in the text ‘Hello World!’, then your program must print out “Hello”, otherwise ‘Bye’.
//
//        Input:
//        A user enters any single letter.
//
//        Output:
//        If the entered letter in 'Hello World!', it prints 'Hello' otherwise  'Bye'
//
//        Example 1:
//        >>>
//        h
//        Hello
//        Example 2:
//        >>>
//        f
//        Bye

package Week3;

import java.util.Scanner;

public class HelloOrBye {
    public static void main(String[] args) {
        Scanner helloOrBye = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = helloOrBye.nextLine();
        if (letter.contains("h")){
            System.out.println("Hello");
        } else if (letter.contains("e")) {
            System.out.println("Hello");
        }else if (letter.contains("l")) {
            System.out.println("Hello");
        }else if (letter.contains("o")) {
            System.out.println("Hello");
        }else if (letter.contains("w")) {
            System.out.println("Hello");
        }else if (letter.contains("r")) {
            System.out.println("Hello");
        }else if (letter.contains("d")) {
            System.out.println("Hello");
        }else if (letter.contains("!")) {
            System.out.println("Hello");
        }else if (letter.contains("H")) {
            System.out.println("Hello");
        }else if (letter.contains("L")) {
            System.out.println("Hello");
        }else if (letter.contains("O")) {
            System.out.println("Hello");
        }else if (letter.contains("W")) {
            System.out.println("Hello");
        }else if (letter.contains("E")) {
            System.out.println("Hello");
        }else if (letter.contains("D")) {
            System.out.println("Hello");
        }else {
            System.out.println("Bye");
        }
    }
}

//&&
//        letter.contains("e") &&
//        letter.contains("l") &&
//        letter.contains("o") &&
//        letter.contains("w") &&
//        letter.contains("r") &&
//        letter.contains("d") &&
//        letter.contains("!")
//



//
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//
//                if (sc.hasNextInt()) {
//                int number = sc.nextInt();
//                System.out.println("Спасибо! Вы ввели число " + number);
//                } else {
//                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
//                }
