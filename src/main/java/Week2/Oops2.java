package Week2;

public class Oops2 {
    public static void main(String[] args) {
        String[] text = {"x is ", "x is now ", "x and y are ", " and "};
        int[] number = {0, 15, 16};
        System.out.printf("%s%d\n",  text[0], number[0]);
        System.out.printf("%s%d\n",  text[1], number[1]);
        System.out.printf("%s%d%s%d\n",  text[2], number[1], text[3], number[2]);
    }
}