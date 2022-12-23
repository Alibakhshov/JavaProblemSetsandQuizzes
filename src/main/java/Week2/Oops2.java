//Instructions:
//        The following program contains 9 errors. Correct the errors and submit a working version of the program. The corrected version of the program should produce the following
//
//        Output:
//        x is 0
//        x is now 15
//        x and y are 15 and 16

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