package Week14;

public class CollatzCalculator {
    public static void main(String[] args) {
        int n = 27;
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}

