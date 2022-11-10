package Week2.Projects;
import java.util.Scanner;


public class TripPlanner1 {
    public static void main(String[] args) {
        travelTimeBudget();

    }

    public static void travelTimeBudget(){
        Scanner welcome = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling? " );
        int trav_days = welcome.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip? " );
        int trav_money = welcome.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? " );
        String trav_curr = welcome.next();
        System.out.println("How many EUR are there in 1 USD? " );
        float curr_conv = welcome.nextFloat();
        System.out.printf("If you are traveling for " + trav_days +
                " days that is same as " + (trav_days * 24) +
                " hours or " + (trav_days * 1440) +
                " minutes or " + (trav_days * 86400) + " seconds\n" +
                "If you are going to spend " + trav_money +
                " USD that means per day you can spend up to " + (trav_money / trav_days) + " USD\n" +
                "Your total budget in " + trav_curr + " is %.2f ", (trav_money * curr_conv));
        System.out.printf( "which per day is %.2f", ((trav_money * curr_conv) / trav_days));

    }
}


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
