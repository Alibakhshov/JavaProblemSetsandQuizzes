import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = Math.abs(input.nextInt());
            System.out.printf("%d + %d%d + %d%d%d = %d", n, n, n, n, n, n, n + n * 11 + n * 111);
        } catch (Exception e) {
            System.out.print("error");
        }
    }
}
