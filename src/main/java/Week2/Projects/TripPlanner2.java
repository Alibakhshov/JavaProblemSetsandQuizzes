package Week2.Projects;
import java.util.Scanner;

public class TripPlanner2 {
    public static void main(String[] args) {
        timeDifference();

    }
    public static void timeDifference(){
        Scanner time = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int differenceInHours = time.nextInt();
        int differenceInMidnight = 0;
        if (differenceInHours < 0) {
            differenceInMidnight = 24;
        }
        System.out.println("That means that when it is midnight at home it will be " +
                (differenceInMidnight + differenceInHours)%24 +
                ":00 in your travel destination and when it's noon at home it will be " +
                (12 + differenceInHours)%24 + ":00\n***********");
    }
}

