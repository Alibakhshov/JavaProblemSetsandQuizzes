package Week2.Projects;

import java.util.Scanner;

public class TripPlanner3 {
    public static void main(String [] args) {

        countryArea();
    }

    public static void countryArea(){
        Scanner area = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int areaInKm = area.nextInt();
        double areaInMi = (areaInKm * 0.38610215854245) * 100;
        areaInMi = (int) areaInMi;
        System.out.println("In miles2 that is " + areaInMi/100 + "\n***********");
    }
}