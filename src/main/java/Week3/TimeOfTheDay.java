package Week3;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = time.nextInt();
        if (number >= 0 && number <= 5){
            System.out.println("Good night!");
        } else if (number > 5 && number < 10) {
            System.out.println("Good Morning!");
        }else if (number >= 10 && number < 20) {
            System.out.println("Good day!");
        }else if (number >= 20 && number <= 24) {
            System.out.println("Good evening!");
        }else {
            System.out.println("Not acceptable time.");
        }
    }
}
