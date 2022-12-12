package Week14;

public class ArmstrongNumbers {
    public static boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        int number = numberToCheck;
        int numberOfDigits = String.valueOf(numberToCheck).length();
        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, numberOfDigits);
            number /= 10;
        }
        return sum == numberToCheck;
    }
}

