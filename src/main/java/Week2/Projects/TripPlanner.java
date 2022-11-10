//First, you’ll want to greet your user and ask them their name.
//As you can see above the user types their response ON THE SAME LINE as the question.
//To do this you’ll want to use a System.out.print() statement.
//nce you have their name use it to greet your user, and then ask them where they would like to go.
//Finally, tell your user, their destination sounds like a great trip! All the code to accomplish Part 1 should be in its own method.
//

package Week2.Projects;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
//        greeting(); // calling the method "greeting"
        travelTimeBudget(); // calling the method "travelTimeBudget"
    }
    public static void greeting() {
        Scanner welcome = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!\n" + "What is your name:");
        while (!welcome.hasNext("[A-Za-z]+")) {
            System.out.println("Not valid! Try again: "); // restricting text responses
            welcome.nextLine();
        }
        String first_name = welcome.nextLine();
        System.out.println("Nice to meet you " + first_name + ", Where are you traveling to? ");
        while (!welcome.hasNext("[A-Za-z]+")) {
            System.out.println("Not valid! Try again: ");
            welcome.nextLine();
        }
        String trav_dest =  welcome.nextLine();
        System.out.println("Great! " + trav_dest + " sounds like a great trip");
    }

    public static void travelTimeBudget(){
        Scanner welcome = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling? " );
        int trav_days = welcome.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip? " );
        int trav_money = welcome.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination? " );
        String trav_curr = welcome.nextLine();
        System.out.println("How many EUR are there in 1 USD? " );
        float curr_conv = welcome.nextInt();
        System.out.printf("If you are traveling for " + trav_days +
                " days that is same as " + (trav_days * 24) +
                " hours or " + (trav_days * 1440) +
                " minutes or " + (trav_days * 86400) + " seconds\n" +
                "If you are going to spend " + trav_money +
                " USD that means per day you can spend up to " + (trav_money / trav_days) + " USD\n" +
                "Your total budget in EUR is " + (trav_money * curr_conv) +
                " EUR, which per day is " + ((trav_money * curr_conv)/31) + " EUR");

    }


}
